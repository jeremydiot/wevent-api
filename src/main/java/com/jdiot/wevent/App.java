package com.jdiot.wevent;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Log LOGGER = LogFactory.getLog(App.class);
    public static void main( String[] args )
    {

        LOGGER.info("Running the main method");
        if (args.length > 0) {
            LOGGER.info("List of arguments: {}"+Arrays.toString(args));
        }
        LOGGER.info("test");
    }
}
