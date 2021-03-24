package ar.com.educacionit.interfaces.main;

import ar.com.educacionit.interfaces.Ilogger;
import ar.com.educacionit.interfaces.impl.EmailLogger;
import ar.com.educacionit.interfaces.impl.HDLogger;

public class  ILoggerFactory {
	public static Ilogger[] buildLoggers (String dest, String msj ) {
		EmailLogger emailLogger = new EmailLogger (dest,msj);
		//emailLogger.log();
		
		HDLogger hdLogger = new HDLogger ("c:/logs", "aprendiendo a usar interfaces");
		//hdLogger.log();
		
		Ilogger[] loggers= new Ilogger[2];
		loggers[0] = emailLogger;
		loggers[1] = hdLogger;
		
		return loggers;
		
	}

}
