package com.oops;

public class Passenger {

	private String pname;
	private long pcontact;
	private String pemail;
	private final long passportno=87909596;
	 
	void setpname(String pname) {
		this.pname=pname;
		}
	String getpname() {
		return pname;
	}
	void setpcontact (long pcontact) {
		this.pcontact=pcontact;
	}
	long getpcontact() {
		return pcontact;
	}
	void setpemail(String pemail) {
		this.pemail=pemail;
	}
	String getpemail() {
		return pemail;
	}
	long getpassportno() {
		return passportno;
	}
}
