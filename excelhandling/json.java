package Automation.excelhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json {
	Scanner scan = new Scanner(System.in);

	
	JSONObject obj = new JSONObject();

	@SuppressWarnings("unchecked")
	void jsonWriter() {

		obj.put("Name", "rani");
		obj.put("Employee ID", 3);
		obj.put("Employee Role", "IT Support engineer");

		JSONObject employee = new JSONObject();
		employee.put("employeeDetails", obj);
		JSONArray array = new JSONArray();
		array.add(employee);
		String directory = System.getProperty("user.dir");
		String fileName = scan.nextLine();
		String filePath = directory + File.separator + fileName;
		File ofile = new File(filePath);

		try {
			@SuppressWarnings("resource")
			FileWriter file1 = new FileWriter(ofile);
			file1.write(array.toString());
			file1.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void jsonRead() {
		JSONParser parse = new JSONParser();
		try {
			FileReader reader = new FileReader("employee.json");
			Object parsed = parse.parse(reader);
			obj = (JSONObject) parsed; // typecasting
			String name = (String) obj.get("Name");
			String id = (String) obj.get("Employee ID");
			String role = (String) obj.get("Employee Role");
			System.out.println("name: " + name);
			System.out.println("id: " + id);
			System.out.println("role: " + role);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
