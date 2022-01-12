package project_cucumber.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public String path;
	static Properties config;
	public ReadPropertyFile() {
		config =new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\SuperITCom\\eclipse-workspace\\project_cucumber\\testdata\\config.properties");
		try {
			config.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getDriverPath() {
	 path = config.getProperty("browser");
		if(path!=null) {
			return path;
		}
		else
			throw new RuntimeException("CD Not specified");
	}
	public String getUrl() {
		String url = config.getProperty("url");
		if(url!=null) {
			return url;
		}
		else
			throw new RuntimeException("URL Not specified");
	}
	public String getItem() {
		String item_name = config.getProperty("item_name");
		if(item_name!=null) {
			return item_name;
		}
		else
			throw new RuntimeException("URL Not specified");
	}
	public String grtExtentReportPath() {
		String ExtentReportPath = config.getProperty("ExtentReportPath");
		if(ExtentReportPath!=null) {
			return ExtentReportPath;
		}
		else
			throw new RuntimeException("ExtentReportPath Not specified");
	}
}
