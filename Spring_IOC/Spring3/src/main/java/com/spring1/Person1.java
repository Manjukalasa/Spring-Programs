package com.spring1;

public class Person1
{
	private int pid;
	private String pname;
	private int page;
	private String pgender;
	public Person1(int pid, String pname, int page, String pgender) {
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pgender = pgender;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getPage() {
		return page;
	}
	public String getPgender() {
		return pgender;
	}
	@Override
	public String toString() {
		return "Person1 [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pgender=" + pgender + "]";
	}
	
	  
}
