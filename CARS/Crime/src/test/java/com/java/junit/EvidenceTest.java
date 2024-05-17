package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.crime.model.Evidence;

public class EvidenceTest {

    @Test
    public void testConstructor() {
        Evidence evidence = new Evidence();
        assertNotNull(evidence);
        Evidence evi = new Evidence(1, "Hair Sample", "1st Balcony", 1);
        assertEquals(1, evi.getEvidenceID());
        assertEquals("Hair Sample", evi.getDes());
        assertEquals("1st Balcony", evi.getLocationFound());
        assertEquals(1, evi.getIncidentID());
    }

    @Test
    public void testGettersAndSetters() {
        Evidence evidence = new Evidence();
        evidence.setEvidenceID(1);
        evidence.setDes("Hair Sample");
        evidence.setLocationFound("1st Balcony");
        evidence.setIncidentID(1);
        assertEquals(1, evidence.getEvidenceID());
        assertEquals("Hair Sample", evidence.getDes());
        assertEquals("1st Balcony", evidence.getLocationFound());
        assertEquals(1, evidence.getIncidentID());
    }

    @Test
    public void testHashCode() {
        Evidence evi = new Evidence(1, "Hair Sample", "1st Balcony", 1);
        Evidence evi1 = new Evidence(1, "Hair Sample", "1st Balcony", 1);
        assertEquals(evi.hashCode(), evi1.hashCode());
    }

    @Test
    public void testEquals() {
        Evidence evi = new Evidence(1, "Hair Sample", "1st Balcony", 1);
        Evidence evi1 = new Evidence(1, "Hair Sample", "1st Balcony", 1);
        Evidence evi2 = new Evidence(3, "Hair Sample", "1st Balcony", 1);
        assertTrue(evi.equals(evi1));
        assertFalse(evi.equals(evi2));
    }

    @Test
    public void testToString() {
        Evidence evi = new Evidence(1, "Hair Sample", "1st Balcony", 1);
        String result = "Evidence [EvidenceID=1, Des=Hair Sample, LocationFound=1st Balcony, IncidentID=1]";
        assertEquals(result, evi.toString());
    }
}