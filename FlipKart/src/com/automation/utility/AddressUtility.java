package com.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.digital.automation.constant.DigitalConstant;

public class AddressUtility {

	public static Properties getProperty() throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\FlipKart\\src\\Address.properties");
		System.setProperty(DigitalConstant.GekoDriver, DigitalConstant.GekoDriverpath);
		obj.load(objfile);
		return obj;
	}

}

