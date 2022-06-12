package com.bridgelabz;

public class Contact {

	private String fname;
	private String lname;
	private long phonenumber;
	private String address;
	private String city;
	private long zip;
	private String state;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Contact [fname=" + fname + ", lname=" + lname + ", phonenumber=" + phonenumber + ", address=" + address
				+ ", city=" + city + ", zip=" + zip + ", state=" + state + "]";
	}
	
	
	public void setAddress(AddressBook address2) {
		// TODO Auto-generated method stub
		
	}
	public AddressBook getAddress() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
