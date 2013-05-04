package distri.ice.server.servants;

import java.util.Random;
import java.util.logging.Logger;


import Ice.Current;
import MiddlewareTestbed._ItemBDisp;

public class ItemBImpl extends _ItemBDisp{
	private static final long serialVersionUID = -2403720749118246531L;
	private static final Logger logger = Logger.getLogger("ItemBImpl");
	private final String name;
	private final int age;

	public ItemBImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public float actionB(String a, Current __current) {
        logger.info("received arg a: " + a);
        float result = (new Random()).nextFloat();
        logger.info("returning: " + result);
        return result;
	}

	@Override
	public String getName(Current __current) {
		return name;
	}

	@Override
	public long getItemAge(Current __current) {
		return age;
	}
}
