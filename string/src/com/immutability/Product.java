package com.immutability;

public class Product {
	private int ppid;
	private String ppname;
	private double ppcost;
	@Override
	public String toString() {
		return "ppid=" + ppid + ", ppname=" + ppname + ", ppcost=" + ppcost;
		
		
	}
	public Product(int ppid, String ppname, double ppcost) {
		super();
		this.ppid = ppid;
		this.ppname = ppname;
		this.ppcost = ppcost;
	}
	public Product() {
		
	}
	public int getPpid() {
		return ppid;
	}
	public Product setPpid(int ppid) {
		return new Product(ppid,ppname,ppid);
	}
	public String getPpname() {
		return ppname;
	}
	public Product setPpname(String ppname) {
		return new Product(ppid,ppname,ppcost);
	}
	public double getPpcost() {
		return ppcost;
	}
	public Product setPpcost(double ppcost) {
		return new Product(ppid,ppname,ppcost);
	}

	
	
}
