package test;

import java.util.ArrayList;
import java.util.List;

import bean.Users;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test1 {

	public static void main(String[] args) {
		//java->json
		Users u1=new Users(1,"ÁõÄÜ","abc",'ÄĞ');
		JSONObject json=JSONObject.fromObject(u1);
		System.out.println(json);//{"password":"abc","sex":"ÄĞ","userid":1,"username":"ÁõÄÜ"}
		//list->json
		
		Users u2=new Users(2,"ÁõÄÜ2","abc2",'ÄĞ');
		Users u3=new Users(3,"ÁõÄÜ3","abc2",'ÄĞ');
		Users u4=new Users(4,"ÁõÄÜ4","abc2",'ÄĞ');
		
		List list=new ArrayList();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		JSONArray arry=JSONArray.fromObject(list);
		System.out.println(arry);
		//[{"password":"abc","sex":"ÄĞ","userid":1,"username":"ÁõÄÜ"},{"password":"abc2","sex":"ÄĞ","userid":2,"username":"ÁõÄÜ2"},{"password":"abc2","sex":"ÄĞ","userid":3,"username":"ÁõÄÜ3"},{"password":"abc2","sex":"ÄĞ","userid":4,"username":"ÁõÄÜ4"}]
		
	}
}
