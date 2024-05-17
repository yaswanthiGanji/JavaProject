package com.java.junit;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.java.crime.model.Victims;

public class VictimsTest {

	@Test
    public void testConstructor() {
        Victims victim = new Victims();
        assertNotNull(victim);
        Victims victim1 = new Victims(1, "Jane", "Doe", Date.valueOf("1990-01-01"), "FEMALE","9876543210", "123 Main St");
        assertEquals(1, victim1.getVictimID());
        assertEquals("Jane", victim1.getFirstName());
        assertEquals("Doe", victim1.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), victim1.getDateOfBirth());
        assertEquals("FEMALE", victim1.getGender());
        assertEquals("9876543210", victim1.getPhoneNumber());
        assertEquals("123 Main St", victim1.getAddress());
    }

    @Test
    public void testGettersAndSetters() {
        Victims victim = new Victims();
        victim.setVictimID(1);
        victim.setFirstName("Jane");
        victim.setLastName("Doe");
        victim.setDateOfBirth(Date.valueOf("1990-01-01"));
        victim.setGender("FEMALE");
        victim.setPhoneNumber("9876543210");
        victim.setAddress("123 Main St");

        assertEquals(1, victim.getVictimID());
        assertEquals("Jane", victim.getFirstName());
        assertEquals("Doe", victim.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), victim.getDateOfBirth());
        assertEquals("FEMALE", victim.getGender());
        assertEquals("9876543210", victim.getPhoneNumber());
        assertEquals("123 Main St", victim.getAddress());
    }

    @Test
    public void testHashCode() {
    	Victims victim1 = new Victims(1, "Jane", "Doe", Date.valueOf("1990-01-01"), "FEMALE","9876543210", "123 Main St");
    	Victims victim2 = new Victims(1, "Jane", "Doe", Date.valueOf("1990-01-01"), "FEMALE","9876543210", "123 Main St");
        assertEquals(victim1.hashCode(), victim2.hashCode());
    }

    @Test
    public void testEquals() {
        Victims victim1 = new Victims(1, "Jane", "Doe", Date.valueOf("1990-01-01"), "FEMALE", "9876543210", "123 Main St");
        Victims victim2 = new Victims(1, "Jane", "Doe", Date.valueOf("1990-01-01"),  "FEMALE", "9876543210", "123 Main St");
        Victims victim3 = new Victims(2, "John", "Smith", Date.valueOf("1995-02-02"),  "FEMALE", "9876543211", "456 Oak St");

        assertTrue(victim1.equals(victim2));
        assertTrue(victim2.equals(victim1));
        assertTrue(victim1.equals(victim1));
        assertFalse(victim1.equals(victim3));
        assertFalse(victim2.equals(victim3));
        assertFalse(victim1.equals(null));
        assertFalse(victim1.equals("Some String"));
    }

    @Test
    public void testToString() {
        Victims victim = new Victims(1, "Jane", "Doe", Date.valueOf("1990-01-01"),"FEMALE", "9876543210", "123 Main St");
        String result = "Victims [VictimID=1, FirstName=Jane, LastName=Doe, DateOfBirth=1990-01-01, Gender=FEMALE, PhoneNumber=9876543210, Address=123 Main St]";
        assertEquals(result, victim.toString());
    }

}