package org.phone;

public class PhoneInfo {

	public void phoneName() {
System.out.println("PhoneName: Iphone");
	}

	public void phoneImeiNum() {
System.out.println("Phone IMEI No: 98654314678");

	}

	public void camera() {
System.out.println("Camera :16pixel ");
	}

	public void Storage() {
System.out.println("Storage: 128GB");
	}

	public void osName() {
System.out.println("OsName: iOS");

	}

	public static void main(String[] args) {
		PhoneInfo phone = new PhoneInfo();
		phone.phoneName();
		phone.phoneImeiNum();
		phone.osName();
		phone.Storage();
	}
}
