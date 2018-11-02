package bean;

public class Users {

	private int userid;
	private String username;
	private String password;
	private char sex;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public Users(int userid, String username, String password, char sex) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.sex = sex;
	}
	public Users() {
		super();
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
}
