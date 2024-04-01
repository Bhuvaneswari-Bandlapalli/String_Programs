package com.immutabilityby.userdefinedclass;

public class Test {

	public static void main(String[] args) {
		Department d=new Department("dev");
		Employee e=new Employee(1,"bhuvana",234.90,d);
		//System.out.println("original "+e.getEid()+"--"+e.getEname()+"--"+e.getEsal()+"--"+e.getDp());
		

		d.dname="sse";
        
       // System.out.println("After change original "+e.getEid()+"--"+e.getEname()+"--"+e.getEsal()+"---"+e.getDp());
        System.out.println(e);
	}

}
