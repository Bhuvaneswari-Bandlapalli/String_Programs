package com.string;

public class One {

	public static void main(String[] args) {
		String h=new String("bhuvana");
		String k=h.intern();
		//new object create in string constant pool so....string is immutable.
		System.out.println(k==h);//false
		System.out.println(k.equals(h));//true
		
		
		String j=new String("slokam ");
		j.concat("rukku");
		System.out.println(j);//slokam
		String p=j.concat("chinna");
		System.out.println(p);//slokam chinna
	}

}
