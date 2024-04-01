package com.string;

public class Comparision {

	public static void main(String[] args) {
		//object.equals for reference comparision
		String s=new String("slokam");
		String k="slokam";
		String m=new String("ram");
		String j="ram";
		String w="ram";
		String e=new String("java");
		String o=s;
		//string .equals method compare content comparision
		//== for reference comparision in string
		System.out.println(s==k);//false
		System.out.println(s.equals(k));//true
		System.out.println(j==w);//true
		System.out.println(j.equals(w));//true
		System.out.println(m==j);//false
		//string constant pool in unrefferenced objects not tuch by the gc.
	System.out.println(s==o);//true
	System.out.println(s.equals(o));//true
	
	}

}
