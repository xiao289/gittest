package test;

import java.util.ArrayList;
import java.util.List;

import bean.Users;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test1 {

	public static void main(String[] args) {
		//java->json
		Users u1=new Users(1,"����","abc",'��');
		JSONObject json=JSONObject.fromObject(u1);
		System.out.println(json);//{"password":"abc","sex":"��","userid":1,"username":"����"}
		//list->json
		
		Users u2=new Users(2,"����2","abc2",'��');
		Users u3=new Users(3,"����3","abc2",'��');
		Users u4=new Users(4,"����4","abc2",'��');
		
		List list=new ArrayList();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		JSONArray arry=JSONArray.fromObject(list);
		System.out.println(arry);
		//[{"password":"abc","sex":"��","userid":1,"username":"����"},{"password":"abc2","sex":"��","userid":2,"username":"����2"},{"password":"abc2","sex":"��","userid":3,"username":"����3"},{"password":"abc2","sex":"��","userid":4,"username":"����4"}]
		
	}
}
