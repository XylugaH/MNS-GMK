package com.xylugah.mnsgmk.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class AppInit {

	private static final Logger logger = Logger.getLogger(AppInit.class);
	private static final String config = "config.properties";
	private static Properties prop = null;

	private AppInit() {}

	public static Properties getProperties() {
		if (prop == null) {
			synchronized (AppInit.class) {
				if (prop == null)
					prop = readConfig();
			}
		}
		return prop;
	}

	private static Properties readConfig() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream(config);
			prop.load(input);
		} catch (IOException ex) {
			logger.error("File read error!!!", ex);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					logger.error("File read error!!!", e);
				}
			}
		}
		return prop;
	}
}
