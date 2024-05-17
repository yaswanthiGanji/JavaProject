package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class SearchIncidentsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Incident Type: ");
        String incidentType = sc.next();

        IncidentsDao dao = new IncidentsDaoImpl();
        try {
            List<Incidents> incidents = dao.SearchIncidents(incidentType);
            if (incidents.isEmpty()) {
                System.out.println("No incidents found for the specified type.");
            } else {
                System.out.println("Incidents found for the specified type:");
                for (Incidents incident : incidents) {
                    System.out.println(incident);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
