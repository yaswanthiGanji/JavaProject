package com.java.crime.model;

import java.util.Objects;

public class LawEnforcementAgency {
    private int agencyID;
    private String agencyName;
    private String jurisdiction;
    private String phoneNumber;
    private String address;

    public LawEnforcementAgency(int agencyID, String agencyName, String jurisdiction, String phoneNumber, String address) {
        this.agencyID = agencyID;
        this.agencyName = agencyName;
        this.jurisdiction = jurisdiction;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(int agencyID) {
        this.agencyID = agencyID;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
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

    @Override
    public String toString() {
        return "LawEnforcementAgency [agencyID=" + agencyID + ", agencyName=" + agencyName + ", jurisdiction="
                + jurisdiction + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyID, agencyName, jurisdiction, phoneNumber, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LawEnforcementAgency other = (LawEnforcementAgency) obj;
        return agencyID == other.agencyID && Objects.equals(agencyName, other.agencyName)
                && Objects.equals(jurisdiction, other.jurisdiction) && Objects.equals(phoneNumber, other.phoneNumber)
                && Objects.equals(address, other.address);
    }
}
