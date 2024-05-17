package com.java.crime.model;

import java.sql.Date;
import java.util.Objects;

public class Suspects {
	private int SuspectID;
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	private String gender;
	private String PhoneNumber;
	private String Address;
	public int getSuspectID() {
		return SuspectID;
	}
	public void setSuspectID(int suspectID) {
		SuspectID = suspectID;
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
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
		return "Suspects [SuspectID=" + SuspectID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", gender=" + gender + ", PhoneNumber=" + PhoneNumber + ", Address="
				+ Address + "]";
	}
	public Suspects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suspects(int suspectID, String firstName, String lastName, Date dateOfBirth, String gender,
			String phoneNumber, String address) {
		super();
		SuspectID = suspectID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, DateOfBirth, FirstName, LastName, PhoneNumber, SuspectID, gender);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suspects other = (Suspects) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(DateOfBirth, other.DateOfBirth)
				&& Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName)
				&& Objects.equals(PhoneNumber, other.PhoneNumber) && SuspectID == other.SuspectID
				&& Objects.equals(gender, other.gender);
	}
	
}