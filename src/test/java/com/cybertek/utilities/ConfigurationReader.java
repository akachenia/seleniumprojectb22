package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
We will create a re - usable method that will be reading from configuration.reader file
 */
public class ConfigurationReader {

    //#1 -Create properties object
    private static Properties properties = new Properties();


    static {
        try{

        //#2 - Load the file into FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");
        properties.load(file);

        file.close();

        }catch (IOException e){

            System.out.println("file not found in Configuration properties");

        }



}

public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
}
}

