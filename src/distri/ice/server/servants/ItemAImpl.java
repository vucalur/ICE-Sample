package distri.ice.server.servants;

import java.util.Random;
import java.util.logging.Logger;

import Ice.Current;
import Ice.LongHolder;
import MiddlewareTestbed._ItemADisp;

public class ItemAImpl extends _ItemADisp {
	private static final long serialVersionUID = 849198335691376948L;
	private static final Logger logger = Logger.getLogger("ItemAImpl");
	private final String name;
	private final long age;

	public ItemAImpl(String name, long age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void actionA(float a, LongHolder b, Current __current) {
		logger.info("received a: " + a);
		b.value = new Random().nextInt();
		logger.info("returning b (out): " + b.value);
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
