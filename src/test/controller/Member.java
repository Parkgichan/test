package test.controller;

public class Member {
	private static int count = 0;
	private String id,pwd;
	
	Member(String id, String pwd){
		this.id = id;
		this.pwd = pwd;
		count++;
	}
	static int getCount() { return count;}
	String getId() {return id;}
	void setId(String id) {this.id = id;}
	String getPwd() { return pwd;}
	void setPwd(String pwd) {this.pwd = pwd;}

}
