package distri.ice.server.servants;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;


import Ice.Current;
import MiddlewareTestbed.Item;
import MiddlewareTestbed.ItemAlreadyExists;
import MiddlewareTestbed.ItemBusy;
import MiddlewareTestbed.ItemNotExists;
import MiddlewareTestbed.ItemPrx;
import MiddlewareTestbed.ItemPrxHelper;
import MiddlewareTestbed._AFactoryDisp;
import distri.ice.server.ItemType;

public class AFactoryImpl extends _AFactoryDisp {
	private static final long serialVersionUID = 7791442777205566458L;

	private static final Logger logger = Logger.getLogger("AFactoryImpl");
	private final Map<String, ItemPrx> items = new HashMap<String, ItemPrx>();
	private final Set<String> takenItems = new HashSet<String>();
	private final Random random = new Random();

	@Override
	public synchronized ItemPrx createItem(String name, String type, Current __current) throws ItemAlreadyExists {
		if (items.containsKey(name)) {
			throw new ItemAlreadyExists();
		}
		logger.info(String.format("Creating item: name:%s type:%s", name, type));

		Item createdItem = null;
		int age = random.nextInt();

		if (type.equals(ItemType.A.key)) {
			createdItem = new ItemAImpl(name, age);
		} else if (type.equals(ItemType.B.key)) {
			createdItem = new ItemBImpl(name, age);
		} else if (type.equals(ItemType.C.key)) {
			createdItem = new ItemCImpl(name, age);
		} else {
			logger.info(String.format("Unrecognised type: %s", type));
			return null;
		}

		ItemPrx proxy = ItemPrxHelper.uncheckedCast(__current.adapter.addWithUUID(createdItem));
		items.put(name, proxy);
		return proxy;
	}

	@Override
	public ItemPrx takeItem(String name, Current __current) throws ItemNotExists, ItemBusy {
		logger.info("Taking item " + name);
		synchronized (this) {
			ensureExists(name);
			if (takenItems.contains(name)) {
				logger.info("Aborting - item \"" + name + "\" already taken");
				throw new ItemBusy();
			}

			takenItems.add(name);
			return items.get(name);
		}
	}

	@Override
	public void releaseItem(String name, Current __current) throws ItemNotExists {
		logger.info("Releasing item " + name);
		ensureExists(name);
		synchronized (this) {
			takenItems.remove(name);
		}
	}

	private void ensureExists(String name) throws ItemNotExists {
		if (items.containsKey(name) == false) {
			logger.info(String.format("Item with name: %s not found", name));
			throw new ItemNotExists();
		}
	}
}
