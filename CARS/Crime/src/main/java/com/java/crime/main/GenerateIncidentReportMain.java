package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class GenerateIncidentReportMain {
    public static void main(String[] args) {
        IncidentsDao dao = new IncidentsDaoImpl();
        try {
            List<Incidents> incidentList = dao.GenerateIncidentsReport();
            System.out.println("Incident Report:");
            for (Incidents incident : incidentList) {
                System.out.println(incident);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
