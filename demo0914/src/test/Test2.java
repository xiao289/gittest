package test;

import java.util.ArrayList;
import java.util.List;

import bean.Users;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test2 {

	public static void main(String[] args) {
		//json->java
		
		String str="{\"password\":\"abc\",\"sex\":\"ÄĞ\",\"userid\":1,\"username\":\"ÁõÄÜ\"}";
		JSONObject js=JSONObject.fromObject(str);
		Users u1=(Users) JSONObject.toBean(js, Users.class);
		System.out.println(u1.getUsername()+"....");
		
		String str2="[{\"password\":\"abc\",\"sex\":\"ÄĞ\",\"userid\":1,\"username\":\"ÁõÄÜ\"},"
				+ "{\"password\":\"abc2\",\"sex\":\"ÄĞ\",\"userid\":2,\"username\":\"ÁõÄÜ2\"},"
			    + "{\"password\":\"abc2\",\"sex\":\"ÄĞ\",\"userid\":3,\"username\":\"ÁõÄÜ3\"},"
				+ "{\"password\":\"abc2\",\"sex\":\"ÄĞ\",\"userid\":4,\"username\":\"ÁõÄÜ4\"}]";
		JSONArray jsonArray=JSONArray.fromObject(str2);
		List<Users> list=(List<Users> )JSONArray.toCollection(jsonArray, Users.class);
		for (Users users : list) {
			System.out.println(users.getUsername()+".."+users.getPassword()+",,,,");
		}
		
		
	}
}
