package com.acc.tibco.interfaceAconyx.util;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * This class is used to configure the output of the log and if something goes wrong 
 * get it from the default configuration in a file properties.
 *
 * @author ACCENTURE
 * @version 1.0
 */
public class TibcoBWLog{

    /**
     * Gets the handler of the logs.
     * 
     * @param clase   Class method call.
     * @return the handler of the logs.
     */
    @SuppressWarnings("unchecked")
	public static Logger getLogger(Class clase) {
        Properties props = new Properties();
        try {
            // Default Properties.
            props.setProperty("log4j.rootLogger", "DEBUG,R");
            props.setProperty("log4j.rootLogger", "debug, R,stdout");
            props.setProperty("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
            props.setProperty("log4j.appender.stdout.layout", "org.apache.log4j.PatternLayout");
            props.setProperty("log4j.appender.stdout.layout.ConversionPattern", "%-5p %c - %m%n");
            props.setProperty("log4j.appender.R", "org.apache.log4j.DailyRollingFileAppender");
            props.setProperty("log4j.appender.R.File", com.tibco.pe.plugin.PluginProperties.getProperty( 
			   										   "tibco.clientVar.GVJavaProcess/log"));        
            //props.setProperty("log4j.appender.R.File", "C:\\tmp\\tibco.loga");        
            props.setProperty("log4j.appender.R.DatePattern", "'.'yyyy-MM-dd'.log'");
            props.setProperty("log4j.appender.R.layout", "org.apache.log4j.PatternLayout");
            props.setProperty("log4j.appender.R.layout.ConversionPattern", "%d [%t] %-5p %c - %m%n");
        } catch (Exception e) {
            props = getDefaultProperties();
        }
        Logger logger = Logger.getLogger(clase);
        PropertyConfigurator.configure(props);
        return logger;
    }

    /**
     * Gets the configuration properties of the log:
     * 'com.acc.tibco.interfaceAconyx.config.BW_ManageUOWLog'.
     * 
     * @return configuration properties.
     */
    private static Properties getDefaultProperties() {

        Properties props = null;
		try {
			props = new TibcoBWProperties("com.acc.tibco.interfaceAconyx.config.BW_ManageUOWLog");
		} catch (Exception e) {
			e.printStackTrace();
		}
        return props;
    }
}
