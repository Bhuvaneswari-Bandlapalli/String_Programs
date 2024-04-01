package com.immutabilityby.userdefinedclass;

public class Department {
	public String dname;

	public String getDname() {
		return dname;
	}

	public Department() {
		
	}


	public Department(String dname) {
		super();
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + "]";
	}


}
