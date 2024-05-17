package com.java.crime.model;

import java.util.Objects;

public class Officer {
    private int officerID;
    private String firstName;
    private String lastName;
    private String badgeNumber;
    private String ranking;
    private String phoneNumber;
    private String address;
    private int agencyID;

    public Officer(int officerID, String firstName, String lastName, String badgeNumber, String ranking,
            String phoneNumber, String address, int agencyID) {
        this.officerID = officerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.badgeNumber = badgeNumber;
        this.ranking = ranking;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.agencyID = agencyID;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(int agencyID) {
        this.agencyID = agencyID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(officerID, firstName, lastName, badgeNumber, ranking, phoneNumber, address, agencyID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Officer officer = (Officer) obj;
        return officerID == officer.officerID &&
                agencyID == officer.agencyID &&
                Objects.equals(firstName, officer.firstName) &&
                Objects.equals(lastName, officer.lastName) &&
                Objects.equals(badgeNumber, officer.badgeNumber) &&
                Objects.equals(ranking, officer.ranking) &&
                Objects.equals(phoneNumber, officer.phoneNumber) &&
                Objects.equals(address, officer.address);
    }
}

