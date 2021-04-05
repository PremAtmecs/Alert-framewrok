package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Locatorinputs {

File file = new File(System.getProperty("user.dir") +"\\src\\main\\java\\com\\utilities\\inputs.properties");
FileInputStream inputStream = null;
Properties property = null;
	 public Locatorinputs() {
		 try {
			 inputStream = new FileInputStream(file);
			 } catch (FileNotFoundException e) {
			 e.printStackTrace();
			 }

			 property = new Properties();

			 try {
			 property.load(inputStream);
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
		}

	 public String getUrl() {
			return property.getProperty("Url");
	}
	 public String getDriver() {
		return property.getProperty("Driver");
		}
	public String getDriverPath() {
			return property.getProperty("DriverPath");
	}

	public String getreqrow() {
		return property.getProperty("alertButton");
		
}
	public String getreqcolumn() {
		return property.getProperty("xpath");
		
}

}
