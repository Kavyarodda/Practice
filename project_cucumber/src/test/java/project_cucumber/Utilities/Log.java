package project_cucumber.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log {
	static Logger log = Logger.getLogger(Log.class);
	public void config() {
		PropertyConfigurator.configure("C:\\Users\\SuperITCom\\eclipse-workspace\\project_cucumber\\resources\\log4j.properties");
	}
	public static  void info(String message) {
		Log.info(message);
	}

	public static void warn(String message) {
		Log.warn(message);
	}

	public static void error(String message) {
		Log.error(message);
	}

	public static void fatal(String message) {
		Log.fatal(message);
	}

	public static void debug(String message) {
		Log.debug(message);
	}
}
