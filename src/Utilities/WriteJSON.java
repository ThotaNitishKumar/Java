package Utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject student1 = new JSONObject();
		student1.put("StudentName", "Nitish");
		student1.put("Grade", "10th");
		student1.put("Location","Hyderbad");
		
		JSONObject student2 = new JSONObject();
		student2.put("StudentName", "Rohit");
		student2.put("Grade", "10th");
		student2.put("Location","Hyderbad");
		
		
		JSONObject student3 = new JSONObject();
		student3.put("StudentName", "Kumar");
		student3.put("Grade", "10th");
		student3.put("Location","Hyderbad");
		
		
		System.out.println(student1.toJSONString());
		System.out.println(student2.toJSONString());
		System.out.println(student3.toJSONString());
		
		JSONArray studentDetails = new JSONArray();
		studentDetails.add(student1);
		studentDetails.add(student2);
		studentDetails.add(student3);
		
		System.out.println(studentDetails.toJSONString());

	}

}
