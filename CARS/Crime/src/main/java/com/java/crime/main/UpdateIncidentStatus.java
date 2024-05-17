package com.java.crime.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;

public class UpdateIncidentStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Incident ID: ");
        int incidentID = scanner.nextInt();

        System.out.print("Enter New Status: ");
        String newStatus = scanner.next(); 

        IncidentsDao dao = new IncidentsDaoImpl();
        try {
            Boolean success = dao.UpdateIncidentsStatus(newStatus, incidentID);
            if (success) {
                System.out.println("Incident status updated successfully.");
            } else {
                System.out.println("Failed to update incident status.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
