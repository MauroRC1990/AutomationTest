package com.automationtest.tools;

import java.io.FileReader;
import java.util.Map;
import java.util.Properties;

public class TestValuesReader {

	Map<Object, Object> map = new Properties();


	public TestValuesReader(){
		try {
			((Properties) map).load(new FileReader("files/TestValues.txt"));
		} catch (Exception exp) {
			System.out.println("Exeption Cause:");
			System.out.println(exp.getCause());
			System.out.println("Exeption Message:");
			System.out.println(exp.getMessage());
			System.out.println("Exeption StackTrace:");
			exp.printStackTrace();
		}
	}
	
	public String getValue(String valueKey) {
		return map.get(valueKey).toString();
	}
}
