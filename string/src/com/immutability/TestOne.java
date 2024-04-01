package com.immutability;

public class TestOne {

	public static void main(String[] args) {
		Product p=new Product(1,"milk",87.90);
		System.out.println(p);
		System.out.println(p.hashCode());
		p.setPpid(2);
		System.out.println(p);
		System.out.println(p.hashCode());
		
		System.out.println("---------------------------------");
	    
		Product v=p.setPpname("nuts");
	    System.out.println(p.hashCode());
	    System.out.println(p);
	   System.out.println("-------------------------------------");
	   
	   Product k=p.setPpcost(67.990);
	   System.out.println(p);
	   System.out.println(k);
	   
	   
	}

}
