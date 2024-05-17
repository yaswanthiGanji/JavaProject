package com.java.crime.model;

import java.util.Date;
import java.util.Objects;

public class Incidents {
    private int IncidentID;
    private String Incidenttype;
    private Date IncidentDate;
    private Double Latitude;
    private Double Longitude;
    private String Description;
    private String Status;
    private int VictimID;
    private int SuspectID;
    private int AgencyID;

    public int getIncidentID() {
        return IncidentID;
    }

    public void setIncidentID(int incidentID) {
        IncidentID = incidentID;
    }

    public String getIncidenttype() {
        return Incidenttype;
    }

    public void setIncidenttype(String incidenttype) {
        Incidenttype = incidenttype;
    }

    public Date getIncidentDate() {
        return IncidentDate;
    }

    public void setIncidentDate(Date incidentDate) {
        IncidentDate = incidentDate;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public String getDescription() {
        return Description;
    }
    
    public void setDescription(String description) {
        Description = description;
    }
   
    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getVictimID() {
        return VictimID;
    }

    public void setVictimID(int victimID) {
        VictimID = victimID;
    }

    public int getSuspectID() {
        return SuspectID;
    }

    public void setSuspectID(int suspectID) {
        SuspectID = suspectID;
    }

    public int getAgencyID() {
        return AgencyID;
    }

    public void setAgencyID(int agencyID) {
        AgencyID = agencyID;
    }

    @Override
    public String toString() {
        return "Incidents [IncidentID=" + IncidentID + ", Incidenttype=" + Incidenttype + ", IncidentDate=" + IncidentDate
                + ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Description=" + Description + ", Status="
                + Status + ", VictimID=" + VictimID + ", SuspectID=" + SuspectID + ", AgencyID=" + AgencyID + "]";
    }

    public Incidents() {
    }

    public Incidents(int incidentID, String incidenttype, Date incidentDate, Double latitude, Double longitude,
                     String description, String status, int victimID, int suspectID, int agencyID) {
        super();
        IncidentID = incidentID;
        Incidenttype = incidenttype;
        IncidentDate = incidentDate;
        Latitude = latitude;
        Longitude = longitude;
        Description = description;
        Status = status;
        VictimID = victimID;
        SuspectID = suspectID;
        AgencyID = agencyID;
    }
    @Override
    public int hashCode() {
        return Objects.hash(IncidentID, Incidenttype, IncidentDate, Latitude, Longitude, Description, Status, VictimID, SuspectID, AgencyID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Incidents incident = (Incidents) obj;
        return IncidentID == incident.IncidentID &&
                Double.compare(incident.Latitude, Latitude) == 0 &&
                Double.compare(incident.Longitude, Longitude) == 0 &&
                VictimID == incident.VictimID &&
                SuspectID == incident.SuspectID &&
                AgencyID == incident.AgencyID &&
                Objects.equals(Incidenttype, incident.Incidenttype) &&
                Objects.equals(IncidentDate, incident.IncidentDate) &&
                Objects.equals(Description, incident.Description) &&
                Objects.equals(Status, incident.Status);
    }

}