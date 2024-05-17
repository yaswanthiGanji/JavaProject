package com.java.crime.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class CreateIncidentMain {

    public static void main(String[] args) {
        Incidents incident = new Incidents();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter IncidentID:");
            incident.setIncidentID(sc.nextInt());
            System.out.println("Enter IncidentType:");
            incident.setIncidenttype(sc.next());
            System.out.print("Enter date (yyyy-MM-dd): ");
            String dateString = sc.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                java.util.Date date = dateFormat.parse(dateString);
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                incident.setIncidentDate(sqlDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("Enter Latitude:");
            incident.setLatitude(sc.nextDouble());
            System.out.println("Enter Longitude:");
            incident.setLongitude(sc.nextDouble());
            System.out.println("Enter Status:");
            incident.setStatus(sc.next());
            System.out.println("Enter VictimID:");
            incident.setVictimID(sc.nextInt());
            System.out.println("Enter SuspectID:");
            incident.setSuspectID(sc.nextInt());
            System.out.println("Enter Description:");
            sc.nextLine(); // Consume newline character
            incident.setDescription(sc.nextLine());
        }

        IncidentsDao dao = new IncidentsDaoImpl();
        try {
            boolean success = dao.createIncident(incident);
            if (success) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
