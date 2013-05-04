package distri.ice.server.servants;

import java.util.Random;
import java.util.logging.Logger;


import Ice.Current;
import Ice.LongHolder;
import Ice.ShortHolder;
import MiddlewareTestbed._ItemCDisp;

public class ItemCImpl extends _ItemCDisp {
	private static final long serialVersionUID = 6399489053382503450L;
	private static final Logger logger = Logger.getLogger("ItemCImpl");
	private final String name;
	private final int age;

	public ItemCImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void actionC(long aIn, LongHolder aOut, ShortHolder b, Current __current) {
		logger.info("received arg aIn: " + aIn);
		Random random = new Random();
		aOut.value = random.nextLong();
		b.value = (short) random.nextInt(Short.MAX_VALUE);
		logger.info("returning aOut (out): " + aOut + " b (out): " + b.value);
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
