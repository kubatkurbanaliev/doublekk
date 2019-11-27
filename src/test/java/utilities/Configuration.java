package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Configuration {

    public static Set<String> getPropertyKeys() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileReader(new File("src\\test\\resources\\conf\\Configuration.properties")));
        return properties.stringPropertyNames();
    }

    public static String getProperties(String key) throws IOException {
        //specify the needed file

        //Read from a file
        Properties properties = new Properties();
        properties.load(new FileReader(new File("src\\test\\resources\\conf\\Configuration.properties")));

//        Set<Object> propertyKeys = properties.keySet();
//
//        boolean bl = false;
//        String value = "";
//        for (Object keys:
//                propertyKeys) {
//            if(keys.equals(key)){
//                bl=true;
//            }
//        }
//
//
//        if(bl){
//            value=properties.getProperty(key);
//            System.out.println("My login properties file is: "+value);
//        }else {
//            System.out.println("Sorry no such key in properties file");
//        }
        return properties.getProperty(key);
    }


}
