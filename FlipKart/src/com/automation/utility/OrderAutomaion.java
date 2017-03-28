package com.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.digital.automation.constant.OrdersConstant;

public class OrderAutomaion {

	public static Properties getProperty() throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\src\\orders.properties");
		System.setProperty(OrdersConstant.GekoDriver, OrdersConstant.GekoDriverpath);
		obj.load(objfile);
		return obj;
	}

}
