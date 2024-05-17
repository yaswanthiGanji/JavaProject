package com.java.crime.main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class GetIncidentsDateRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Date (yyyy-MM-dd): ");
        String startDateString = sc.next();
        System.out.print("Enter End Date (yyyy-MM-dd): ");
        String endDateString = sc.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date startDate = dateFormat.parse(startDateString);
            java.util.Date endDate = dateFormat.parse(endDateString);

            Date sqlStartDate = new Date(startDate.getTime());
            Date sqlEndDate = new Date(endDate.getTime());

            IncidentsDao dao = new IncidentsDaoImpl();
            List<Incidents> incidents = dao.GetIncidentsInDateRange(sqlStartDate, sqlEndDate);

            if (incidents.isEmpty()) {
                System.out.println("No incidents found within the specified date range.");
            } else {
                System.out.println("Incidents within the specified date range:");
                for (Incidents incident : incidents) {
                    System.out.println(incident);
                }
            }
        } catch (ParseException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

