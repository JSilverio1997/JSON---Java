package com.codeFactory.main;

import java.util.HashMap;
import java.util.Map;

import com.codeFactory..Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String args[]) {
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("C#");
		employee.setGender("Python");
		employee.setDesignation("JAVA");
		
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Bem-Vindo");
		map.put("2", "the");
		map.put("3", "Programming");
		try 
		{
			String jsonStr = objectMapper.writeValueAsString(map);
			System.out.println(jsonStr);
			
		} catch (JsonProcessingException e) 
		{
			e.printStackTrace();
		}
		
	}
}
