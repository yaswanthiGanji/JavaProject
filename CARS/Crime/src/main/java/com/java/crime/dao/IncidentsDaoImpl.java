package com.java.crime.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.crime.model.Incidents;
import com.java.crime.util.DBConnUtil;
import com.java.crime.util.DBPropertyUtil;
public class IncidentsDaoImpl implements IncidentsDao{
	Connection connection ;
	PreparedStatement pst;
	@Override
	public boolean createIncident(Incidents incident) throws ClassNotFoundException, SQLException {
	    String connStr = DBPropertyUtil.connectionString("db");
	    connection = DBConnUtil.getConnection(connStr);
	    String cmd = "Insert into Incidents(IncidentID, IncidentType, IncidentDate, Latitude, Longitude, Description, Status, VictimID, SuspectID) "
	            + " values(?,?,?,?,?,?,?,?,?)";
	    pst = connection.prepareStatement(cmd);
	    pst.setInt(1, incident.getIncidentID());
	    pst.setString(2, incident.getIncidenttype());
	    pst.setDate(3, new java.sql.Date(incident.getIncidentDate().getTime())); // Convert java.util.Date to java.sql.Date
	    pst.setDouble(4, incident.getLatitude());
	    pst.setDouble(5, incident.getLongitude());
	    pst.setString(6, incident.getDescription());
	    pst.setString(7, incident.getStatus());
	    pst.setInt(8, incident.getVictimID());
	    pst.setInt(9, incident.getSuspectID());

	    int rowsInserted = pst.executeUpdate();
	    return rowsInserted > 0;
	}

	@Override
	public List<Incidents> SearchIncidents(String IncidentType) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Incidents where IncidentType=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, IncidentType);
		ResultSet rs = pst.executeQuery();
		List<Incidents> incidentList = new ArrayList<Incidents>();
		Incidents incident= null;
		while(rs.next()) {
			incident=new Incidents();
			incident.setIncidentID(rs.getInt("IncidentID"));
			incident.setIncidenttype(rs.getString("IncidentType"));
			incident.setIncidentDate(rs.getDate("IncidentDate"));
			incident.setLatitude(rs.getDouble("Latitude"));
			incident.setLongitude(rs.getDouble("Longitude"));
			incident.setDescription(rs.getString("Description"));
			incident.setStatus(rs.getString("status"));
			incident.setVictimID(rs.getInt("VictimID"));
			incident.setSuspectID(rs.getInt("SuspectID"));
			incidentList.add(incident);
			
		}
		return incidentList;
		
		
		
		
	}




	
	@Override
	public boolean UpdateIncidentsStatus(String Status, int IncidentID) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String  cmd="update Incidents set status=? where IncidentID=? ";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Status);
		pst.setInt(2, IncidentID);
		
	
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
		return false;
		}
	}
	@Override
	public List<Incidents> GenerateIncidentsReport() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd=" select * from Incidents";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		List<Incidents> incidentList = new ArrayList<Incidents>();
		Incidents incident1= null;
		while(rs.next()) {
			incident1=new Incidents();
			incident1.setIncidentID(rs.getInt("IncidentID"));
			incident1.setIncidenttype(rs.getString("IncidentType"));
			incident1.setIncidentDate(rs.getDate("IncidentDate"));
			incident1.setLatitude(rs.getDouble("Latitude"));
			incident1.setLongitude(rs.getDouble("Longitude"));
			incident1.setDescription(rs.getString("description"));
			incident1.setStatus(rs.getString("status"));
			incident1.setVictimID(rs.getInt("VictimID"));
			incident1.setSuspectID(rs.getInt("SuspectID"));
			incidentList.add(incident1);
			
		}
		return incidentList;
		
		
	}


	
	
	
	@Override
	public List<Incidents> GetIncidentsInDateRange(Date startDate, Date endDate)
			throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd ="select * from incidents where IncidentDate between ? and ? ";
		
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, startDate);
		pst.setDate(2, endDate);
		
		ResultSet rs=pst.executeQuery();
		List<Incidents> incidentList = new ArrayList<Incidents>();
		Incidents incident=null;
		while(rs.next()) {
			incident= new Incidents();
			incident.setIncidentID(rs.getInt("IncidentID"));
			incident.setIncidenttype(rs.getString("IncidentType"));
			incident.setIncidentDate(rs.getDate("IncidentDate"));
			incident.setLatitude(rs.getDouble("Latitude"));
			incident.setLongitude(rs.getDouble("Longitude"));
			incident.setDescription(rs.getString("description"));
			incident.setStatus(rs.getString("status"));
			incident.setVictimID(rs.getInt("VictimID"));
			incident.setSuspectID(rs.getInt("SuspectID"));
			incidentList.add(incident);
			
		}
		return incidentList;
	}
	}