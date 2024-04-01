package com.string;

public class TwoB {

	public static void main(String[] args) {
		//StringBuffer is synccronized and not immutable...because it won't create new object
		StringBuffer k=new StringBuffer("slokam ");
		k.append("chinna");
		System.out.println(k);//slokam chinna
		k.insert(0,"tech ");
		System.out.println(k);//tech slokam chinna
		System.out.println(k.capacity());
		System.out.println(k.replace(2, 8,"bhuvana"));
		System.out.println(k.delete(3, 7));
		System.out.println(k.reverse());
		//StringBulder also have the same methods but it is not have syncronization

	}

}
