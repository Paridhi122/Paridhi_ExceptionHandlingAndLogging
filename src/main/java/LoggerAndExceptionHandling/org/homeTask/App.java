package LoggerAndExceptionHandling.org.homeTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    private static final Logger Logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Logger.debug("This is a debug");
        Logger.info("This is an info");
        Logger.warn("This is a warning");
        Logger.error("This is an error");
        Logger.fatal("This is fatal");
    }
}
