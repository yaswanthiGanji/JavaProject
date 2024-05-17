package com.java.crime.model;

import java.util.Objects;

public class Evidence {
	private int EvidenceID;
    private String Des;
    private String LocationFound;
    private int IncidentID;
	public int getEvidenceID() {
		return EvidenceID;
	}
	public void setEvidenceID(int evidenceID) {
		EvidenceID = evidenceID;
	}
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		Des = des;
	}
	public String getLocationFound() {
		return LocationFound;
	}
	public void setLocationFound(String locationFound) {
		LocationFound = locationFound;
	}
	public int getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(int incidentID) {
		IncidentID = incidentID;
	}
	@Override
	public String toString() {
		return "Evidence [EvidenceID=" + EvidenceID + ", Des=" + Des + ", LocationFound=" + LocationFound
				+ ", IncidentID=" + IncidentID + "]";
	}
	public Evidence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evidence(int evidenceID, String des, String locationFound, int incidentID) {
		super();
		EvidenceID = evidenceID;
		Des = des;
		LocationFound = locationFound;
		IncidentID = incidentID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Des, EvidenceID, IncidentID, LocationFound);
	}
	@Override
	public boolean equals(Object obj) {
		Evidence evidence = (Evidence)obj;
		if(evidence.getEvidenceID()==EvidenceID && evidence.getDes()==Des && evidence.getLocationFound()
				== LocationFound && evidence.getIncidentID() == IncidentID) {
			return true;
		}
		return false;
	}
    

}