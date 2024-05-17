package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.crime.model.LawEnforcementAgency;

public class LawEnforcementAgencyTest {

    @Test
    public void testConstructor() {
        LawEnforcementAgency agency = new LawEnforcementAgency(31, "Andhra Pradesh Police Department", "Statewide", "9876543210", "Andhra Pradesh");
        assertNotNull(agency);
        assertEquals(31, agency.getAgencyID());
        assertEquals("Andhra Pradesh Police Department", agency.getAgencyName());
        assertEquals("Statewide", agency.getJurisdiction());
        assertEquals("9876543210", agency.getPhoneNumber());
        assertEquals("Andhra Pradesh", agency.getAddress());
    }

    @Test
    public void testGettersAndSetters() {
        LawEnforcementAgency agency = new LawEnforcementAgency(31, "Andhra Pradesh Police Department", "Statewide", "9876543210", "Andhra Pradesh");
        agency.setAgencyID(32);
        agency.setAgencyName("Visakhapatnam City Police");
        agency.setJurisdiction("Visakhapatnam City");
        agency.setPhoneNumber("8765432109");
        agency.setAddress("Andhra Pradesh");

        assertEquals(32, agency.getAgencyID());
        assertEquals("Visakhapatnam City Police", agency.getAgencyName());
        assertEquals("Visakhapatnam City", agency.getJurisdiction());
        assertEquals("8765432109", agency.getPhoneNumber());
        assertEquals("Andhra Pradesh", agency.getAddress());
    }

    @Test
    public void testHashCode() {
        LawEnforcementAgency agency1 = new LawEnforcementAgency(31, "Andhra Pradesh Police Department", "Statewide", "9876543210", "Andhra Pradesh");
        LawEnforcementAgency agency2 = new LawEnforcementAgency(31, "Andhra Pradesh Police Department", "Statewide", "9876543210", "Andhra Pradesh");
        assertEquals(agency1.hashCode(), agency2.hashCode());
    }

    @Test
    public void testEquals() {
        LawEnforcementAgency agency1 = new LawEnforcementAgency(31, "Andhra Pradesh Police Department", "Statewide", "9876543210", "Andhra Pradesh");
        LawEnforcementAgency agency2 = new LawEnforcementAgency(31, "Andhra Pradesh Police Department", "Statewide", "9876543210", "Andhra Pradesh");
        LawEnforcementAgency agency3 = new LawEnforcementAgency(32, "Visakhapatnam City Police", "Visakhapatnam City", "8765432109", "Andhra Pradesh");

        assertTrue(agency1.equals(agency2));
        assertTrue(agency2.equals(agency1));
        assertTrue(agency1.equals(agency1));
        assertFalse(agency1.equals(agency3));
        assertFalse(agency2.equals(agency3));
        assertFalse(agency1.equals(null));
        assertFalse(agency1.equals("Some String"));
    }

    @Test
    public void testToString() {
        LawEnforcementAgency agency = new LawEnforcementAgency(31, "Andhra Pradesh Police Department", "Statewide", "9876543210", "Andhra Pradesh");
        String result = "LawEnforcementAgency [agencyID=31, agencyName=Andhra Pradesh Police Department, jurisdiction=Statewide, phoneNumber=9876543210, address=Andhra Pradesh]";
        assertEquals(result, agency.toString());
    }
}
