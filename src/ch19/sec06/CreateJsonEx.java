package ch19.sec06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {
	public static void main(String[] args) throws IOException{
		// JSON 객체 생성
		JSONObject root = new JSONObject();
		
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		root.put("tel", tel);
		
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill", skill);
		
		String json = root.toString();
		
		System.out.println(json);
		
		//파일로 저장
		Writer writer = new FileWriter("D:/자바/member.json");
		writer.write(json);
		writer.flush();
		writer.close();
	}
}
