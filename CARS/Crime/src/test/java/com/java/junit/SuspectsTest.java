package com.java.junit;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;


import com.java.crime.model.Suspects;

public class SuspectsTest {

	@Test
    public void testConstructor() {
        Suspects suspect = new Suspects();
        assertNotNull(suspect);
        Suspects suspect1 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), "MALE", "9876543210", "123 Main St");
        assertEquals(1, suspect1.getSuspectID());
        assertEquals("John", suspect1.getFirstName());
        assertEquals("Doe", suspect1.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), suspect1.getDateOfBirth());
        assertEquals("MALE", suspect1.getGender());
        assertEquals("9876543210", suspect1.getPhoneNumber());
        assertEquals("123 Main St", suspect1.getAddress());
    }

    @Test
    public void testGettersAndSetters() {
        Suspects suspect = new Suspects();
        suspect.setSuspectID(1);
        suspect.setFirstName("John");
        suspect.setLastName("Doe");
        suspect.setDateOfBirth(Date.valueOf("1990-01-01"));
        suspect.setGender("MALE");
        suspect.setPhoneNumber("9876543210");
        suspect.setAddress("123 Main St");

        assertEquals(1, suspect.getSuspectID());
        assertEquals("John", suspect.getFirstName());
        assertEquals("Doe", suspect.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), suspect.getDateOfBirth());
        assertEquals("MALE", suspect.getGender());
        assertEquals("9876543210", suspect.getPhoneNumber());
        assertEquals("123 Main St", suspect.getAddress());
    }

    @Test
    public void testHashCode() {
        Suspects suspect1 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), "MALE", "9876543210", "123 Main St");
        Suspects suspect2 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"),"MALE", "9876543210", "123 Main St");
        assertEquals(suspect1.hashCode(), suspect2.hashCode());
    }

    @Test
    public void testEquals() {
        Suspects suspect1 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), "MALE", "9876543210", "123 Main St");
        Suspects suspect2 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), "MALE", "9876543210", "123 Main St");
        Suspects suspect3 = new Suspects(2, "Jane", "Smith", Date.valueOf("1995-02-02"), "MALE", "9876543211", "456 Oak St");

        assertTrue(suspect1.equals(suspect2));
        assertTrue(suspect2.equals(suspect1));
        assertTrue(suspect1.equals(suspect1));
        assertFalse(suspect1.equals(suspect3));
        assertFalse(suspect2.equals(suspect3));
        assertFalse(suspect1.equals(null));
        assertFalse(suspect1.equals("Some String"));
    }

    @Test
    public void testToString() {
        Suspects suspect = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), "MALE", "9876543210", "123 Main St");
        String result = "Suspects [SuspectID=1, FirstName=John, LastName=Doe, DateOfBirth=1990-01-01, gender=MALE, PhoneNumber=9876543210, Address=123 Main St]";
        assertEquals(result, suspect.toString());
    }

}