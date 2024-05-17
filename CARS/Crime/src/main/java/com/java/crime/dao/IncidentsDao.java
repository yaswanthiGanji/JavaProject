package com.java.crime.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.java.crime.model.Incidents;

public interface IncidentsDao {
	boolean createIncident(Incidents incident) throws ClassNotFoundException, SQLException;
	List<Incidents> SearchIncidents(String IncidentType) throws ClassNotFoundException, SQLException; 
	boolean UpdateIncidentsStatus(String Status,int IncidentID) throws ClassNotFoundException, SQLException; 
    List<Incidents>GenerateIncidentsReport() throws ClassNotFoundException, SQLException;
	List<Incidents> GetIncidentsInDateRange(Date startDate, Date endDate) throws ClassNotFoundException, SQLException;
}