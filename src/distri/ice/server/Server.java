package distri.ice.server;



import java.util.logging.Logger;

import distri.ice.server.servants.AFactoryImpl;

public class Server extends Ice.Application {
	private static final String ICE_CONFIG_PREFIX = "--Ice.Config=";
	private static final Logger logger = Logger.getLogger("Server");

	@Override
	public int run(String[] args) {
		Ice.ObjectAdapter adapter = communicator().createObjectAdapter(args[1]);
		adapter.add(new AFactoryImpl(), communicator().stringToIdentity(args[1]));
		adapter.activate();
		print("Server initialized...");
		communicator().waitForShutdown();
		return 0;
	}

	public static void main(String[] args) {
		if (args.length < 2 ){ //|| !args[0].startsWith(ICE_CONFIG_PREFIX)) {
			print("Usage: java Server " + ICE_CONFIG_PREFIX + "<server_config_file> <adapter_name>");
			System.exit(1);
		}
		args[0] = args[0].replaceFirst(ICE_CONFIG_PREFIX, "");
		Server app = new Server();
		int status = app.main("Server", args, args[0]);
		System.exit(status);
	}

	private static void print(String msg) {
		System.out.println(msg);
	}
}