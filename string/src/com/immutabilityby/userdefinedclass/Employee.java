package com.immutabilityby.userdefinedclass;

public final class Employee {
	
	private final int eid;
	private final String ename;
	private final double esal;
	private Department dp;
	
	public Employee(int eid, String ename, double esal, Department dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		dep=new Department(dep.dname);
		this.dp = dep;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", dp=" + dp;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getEsal() {
		return esal;
	}
	public Department getDp() {
		return dp;
	}
	
	
}
