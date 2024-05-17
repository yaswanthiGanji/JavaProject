package com.java.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Date;

import org.junit.Test;

import com.java.crime.model.Incidents;

public class IncidentsTest {

	@Test
    public void testConstructor1() {
		Incidents inc = new Incidents();
		assertNotNull(inc);

      Incidents incident = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749, 
        		122.4194, "Sample description", "Open", 30, 15, 45);
    
      assertEquals(Integer.valueOf(1), Integer.valueOf(incident.getIncidentID()));
      assertEquals("Theft", incident.getIncidenttype());
      assertEquals(Date.valueOf("2023-05-01"), incident.getIncidentDate());
      assertEquals(Double.valueOf(37.7749), Double.valueOf(incident.getLatitude()));
      assertEquals(Double.valueOf(122.4194), Double.valueOf(incident.getLongitude()));
      assertEquals("Sample description", incident.getDescription());
      assertEquals("Open", incident.getStatus());
      assertEquals(Integer.valueOf(30), Integer.valueOf(incident.getVictimID()));
      assertEquals(Integer.valueOf(15), Integer.valueOf(incident.getSuspectID()));
      assertEquals(Integer.valueOf(45), Integer.valueOf(incident.getAgencyID()));

    }
	
	@Test
	public void testGettersAndSetters() {
	    Incidents incident = new Incidents();
	    incident.setIncidentID(1);
	    incident.setIncidenttype("Theft");
	    incident.setIncidentDate(Date.valueOf("2023-05-01"));
	    incident.setLatitude(37.7749);
	    incident.setLongitude(122.4194);
	    incident.setDescription("Sample description");
	    incident.setStatus("Open");
	    incident.setSuspectID(30);
	    incident.setVictimID(15);
	    incident.setAgencyID(45);

	    assertEquals(Integer.valueOf(1), Integer.valueOf(incident.getIncidentID()));
	    assertEquals("Theft", incident.getIncidenttype());
	    assertEquals(Date.valueOf("2023-05-01"), incident.getIncidentDate());
	    assertEquals(Double.valueOf(37.7749), Double.valueOf(incident.getLatitude()));
	    assertEquals(Double.valueOf(122.4194), Double.valueOf(incident.getLongitude()));
	    assertEquals("Sample description", incident.getDescription());
	    assertEquals("Open", incident.getStatus());
	    assertEquals(Integer.valueOf(30), Integer.valueOf(incident.getSuspectID()));
	    assertEquals(Integer.valueOf(15), Integer.valueOf(incident.getVictimID()));
	    assertEquals(Integer.valueOf(45), Integer.valueOf(incident.getAgencyID()));
	}

	@Test
	public void testToString() {
	    Incidents incident = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749,
	            122.4194, "Sample description", "Open", 30, 15, 45);
	    String result = "Incidents [IncidentID=1, Incidenttype=Theft, IncidentDate=2023-05-01, Latitude=37.7749, " +
	            "Longitude=122.4194, Description=Sample description, Status=Open, VictimID=30, " +
	            "SuspectID=15, AgencyID=45]";
	    assertEquals(result, incident.toString());
	}

	
	@Test
	public void testHashCode() {
		Incidents incident = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749, 
        		122.4194, "Sample description", "Open", 30, 15, 45);
		Incidents incident2 = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749, 
        		122.4194, "Sample description", "Open", 30, 15, 45);
		assertEquals(incident.hashCode(), incident2.hashCode());

	}
	
	@Test
	public void testEquals() {
		Date date = Date.valueOf("2023-05-01");
        Incidents incident1 = new Incidents(1, "Theft", date, 37.7749, -122.4194, "Sample description", "Open", 2, 3, 4);
        Incidents incident2 = new Incidents(1, "Theft", date, 37.7749, -122.4194, "Sample description", "Open", 2, 3, 4);
        Incidents incident3 = new Incidents(2, "Robbery", date, 37.7749, -122.4194, "Another description", "Closed", 5, 6, 7);
        assertTrue(incident1.equals(incident2));
        assertTrue(incident2.equals(incident1));
        assertTrue(incident1.equals(incident1));
        assertFalse(incident1.equals(incident3));
        assertFalse(incident2.equals(incident3));
        assertFalse(incident1.equals(null));
        assertFalse(incident1.equals("Some String"));

		
	}

}