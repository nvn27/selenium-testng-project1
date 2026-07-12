package com.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

	private static final String PROP_FILENAME = "config.properties";
	private static final String CONFIG_PROPS = System.getProperty("user.dir") + "/src/main/resources/" + PROP_FILENAME;
	public static final Properties PROPS = new Properties();

	static {
		try {
			PROPS.load(new FileInputStream(CONFIG_PROPS));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
