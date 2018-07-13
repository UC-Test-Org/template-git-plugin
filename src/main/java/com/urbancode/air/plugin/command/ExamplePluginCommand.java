/*
* Licensed Materials - Property of IBM Corp.
* IBM UrbanCode Deploy
* (c) Copyright IBM Corporation 2011, 2014. All Rights Reserved.
*
* U.S. Government Users Restricted Rights - Use, duplication or disclosure restricted by
* GSA ADP Schedule Contract with IBM Corp.
*/
package com.urbancode.air.plugin.command;

import java.util.Date;
import java.util.Properties;

public class ExamplePluginCommand {

    //**********************************************************************************************
    // CLASS
    //**********************************************************************************************

    //**********************************************************************************************
    // INSTANCE
    //**********************************************************************************************
    private Properties inputProperties;
    private Properties outputProperties;
    
    /**
     * Standard plugin command constructor. It must take two Properties objects. inputProperties will
     * contain all of the values passed into this plugin step. outputProperties can be populated with
     * values and will be written to the output properties file on returning from execute.
     * 
     * @param inputProperties
     * @param outputProperties
     */
    public ExamplePluginCommand(Properties inputProperties, Properties outputProperties) {
        this.inputProperties = inputProperties;
        this.outputProperties = outputProperties;
    }
    
    /**
     * Commands must have an execute() method which returns an int. Returning 0 should mean success,
     * anything else means failure.
     */
    public int execute() {
        System.out.println("Hello world!");
        System.out.println("Some property was: "+inputProperties.getProperty("someProperty"));
        
        // Set output property to be picked up by the plugin runtime.
        outputProperties.setProperty("currentTime", ""+new Date().getTime());
        
        return 0;
    }
}
