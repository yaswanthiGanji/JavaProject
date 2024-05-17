package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.crime.model.Officer;

public class OfficerTest {

    @Test
    public void testConstructor() {
        Officer officer = new Officer(62, "Jane", "Smith", "23456", "72", "8765432109", "456 Elm St, Vijayawada", 32);
        assertNotNull(officer);
        assertEquals(62, officer.getOfficerID());
        assertEquals("Jane", officer.getFirstName());
        assertEquals("Smith", officer.getLastName());
        assertEquals("23456", officer.getBadgeNumber());
        assertEquals("72", officer.getRanking());
        assertEquals("8765432109", officer.getPhoneNumber());
        assertEquals("456 Elm St, Vijayawada", officer.getAddress());
        assertEquals(32, officer.getAgencyID());
    }

    @Test
    public void testGettersAndSetters() {
        Officer officer = new Officer(0, null, null, null, null, null, null, 0);
        officer.setOfficerID(63);
        officer.setFirstName("Michael");
        officer.setLastName("Johnson");
        officer.setBadgeNumber("34567");
        officer.setRanking("51");
        officer.setPhoneNumber("7654321098");
        officer.setAddress("789 Oak St, Guntur");
        officer.setAgencyID(33);

        assertEquals(63, officer.getOfficerID());
        assertEquals("Michael", officer.getFirstName());
        assertEquals("Johnson", officer.getLastName());
        assertEquals("34567", officer.getBadgeNumber());
        assertEquals("51", officer.getRanking());
        assertEquals("7654321098", officer.getPhoneNumber());
        assertEquals("789 Oak St, Guntur", officer.getAddress());
        assertEquals(33, officer.getAgencyID());
    }

    @Test
    public void testHashCode() {
        Officer officer1 = new Officer(64, "Emily", "Brown", "45678", "70", "6543210987", "321 Pine St, Rajahmundry", 34);
        Officer officer2 = new Officer(64, "Emily", "Brown", "45678", "70", "6543210987", "321 Pine St, Rajahmundry", 34);
        assertEquals(officer1.hashCode(), officer2.hashCode());
    }

    @Test
    public void testEquals() {
        Officer officer1 = new Officer(65, "David", "Wilson", "56789", "85", "5432109876", "555 Cedar St, Tirupati", 35);
        Officer officer2 = new Officer(65, "David", "Wilson", "56789", "85", "5432109876", "555 Cedar St, Tirupati", 35);
        Officer officer3 = new Officer(66, "Alex", "Turner", "67890", "80", "4321098765", "888 Maple St, Vizag", 36);

        assertTrue(officer1.equals(officer2));
        assertTrue(officer2.equals(officer1));
        assertTrue(officer1.equals(officer1));
        assertFalse(officer1.equals(officer3));
        assertFalse(officer2.equals(officer3));
        assertFalse(officer1.equals(null));
        assertFalse(officer1.equals("Some String"));
    }
}
