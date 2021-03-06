package com.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.digital.automation.constant.AddressesConstant;

public class AutomationUtility {

	public static Properties getProperty() throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\FlipKart\\src\\objects.properties");
		System.setProperty(AddressesConstant.GekoDriver, AddressesConstant.GekoDriverpath);
		obj.load(objfile);
		return obj;
	}

}
