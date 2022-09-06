package org.phone;

public class Phone {

	public void phoneInfo(String s) {
		System.out.println("Iphone" + s);
	}
	public void phoneInfo(String s,char c) {
		System.out.println("PhoneName" + s);
		System.out.println("Phone Char:"+c);
	}
	public void phoneInfo(char c,String s) {
		System.out.println("Phone Char:"+c);
		System.out.println("PhoneName" + s);
	}
	public void phoneInfo(String s,int i) {
		System.out.println("PhoneName" + s);
		System.out.println("MobileCost:"+i);
	}
	
	public static void main(String[] args) {

		Phone p = new Phone();
		p.phoneInfo("Iphone");
		p.phoneInfo("Apple", 'A');
		p.phoneInfo('S', "Samsung");
		p.phoneInfo("Apple", 29000);
	}

}
