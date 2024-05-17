package com.java.crime.model;

import java.sql.Date;
import java.util.Objects;

public class Victims {
	private int VictimID;
	private String FirstName;
	private String LastName ;
	private Date DateOfBirth;
	private String Gender;
	private String PhoneNumber;
	private String Address;
	public int getVictimID() {
		return VictimID;
	}
	public void setVictimID(int victimID) {
		VictimID = victimID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Victims [VictimID=" + VictimID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender + ", PhoneNumber=" + PhoneNumber + ", Address="
				+ Address + "]";
	}
	public Victims() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Victims(int victimID, String firstName, String lastName, Date dateOfBirth, String gender, String phoneNumber,
			String address) {
		super();
		VictimID = victimID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Gender = gender;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, DateOfBirth, FirstName, Gender, LastName, PhoneNumber, VictimID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Victims other = (Victims) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(DateOfBirth, other.DateOfBirth)
				&& Objects.equals(FirstName, other.FirstName) && Objects.equals(Gender, other.Gender)
				&& Objects.equals(LastName, other.LastName) && Objects.equals(PhoneNumber, other.PhoneNumber)
				&& VictimID == other.VictimID;
	}
	

}