package com.acc.tibco.interfaceAconyx.util;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;

/**
 * This class is responsible for obtaining the properties of the process 
 * configuration from a file.
 * 
 * @author ACCENTURE
 * @version 1.0
 */
public class TibcoBWProperties extends Properties {
	
	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
    
    /**
     * Get a properties file in the class path.
     * 
     * @param  sProperties          	Name of the file Properties.
     * @throws InternalErrorException	InternalErrorException occurred during the execution of the method.
     */
    public TibcoBWProperties(String sProperties) throws InternalErrorException {
        super();
        try {
            ClassLoader loader = ClassLoader.getSystemClassLoader();
            System.out.println("sProperties " + sProperties);
            System.out.println("LocategetDefault " + Locale.getDefault());
            System.out.println("loader " );
            final ResourceBundle rb = 
                ResourceBundle.getBundle(sProperties, Locale.getDefault(), 
                                         loader);
            for (Enumeration<String> keys = rb.getKeys(); keys.hasMoreElements(); ) {
                final String key = keys.nextElement();
                final String value = rb.getString(key);
                put(key, value);
            }
        } catch (Exception e) {
            throw new InternalErrorException(e.getMessage());
        }
    }
}