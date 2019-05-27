package Beta;

import org.apache.logging.log4j.*;


public class DemoBeta {
	private static Logger log = LogManager.getLogger(DemoBeta.class.getName());
	public static void main(String[] args) {
		log.debug("I am debugging");
		log.info("Info log");
		log.error("object is not present");	
		log.fatal("this is fatal");
	}

}
