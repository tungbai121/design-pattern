package org.example;

import javax.management.InstanceNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Injector {
    private static final String IOC_CONFIGURATION_FILE_NAME = "ioc.properties";

    private Injector() {
        throw new UnsupportedOperationException();
    }

    public static Object getInstance(String key) throws InstanceNotFoundException {
        try (InputStream input = new FileInputStream(IOC_CONFIGURATION_FILE_NAME)) {
            Properties properties = new Properties();
            properties.load(input);
            String className = properties.getProperty(key);
            return Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (IOException | InstantiationException | ClassNotFoundException | IllegalAccessException |
                 InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
            throw new InstanceNotFoundException("Can't create instance of " + key + " base on  the configuration of " + IOC_CONFIGURATION_FILE_NAME);
        }
    }
}
