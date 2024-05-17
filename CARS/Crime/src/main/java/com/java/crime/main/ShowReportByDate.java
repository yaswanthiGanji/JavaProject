package com.java.crime.main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;
import com.java.crime.model.Reports;

public class ShowReportByDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Date (yyyy-MM-dd): ");
        String dateString = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date date = dateFormat.parse(dateString);
            Date sqlDate = new Date(date.getTime());

            ReportsDao dao = new ReportsDaoImpl();
            List<Reports> reports = dao.showReportByDate(sqlDate);

            if (reports.isEmpty()) {
                System.out.println("No reports found for the specified date.");
            } else {
                System.out.println("Reports for the specified date:");
                for (Reports report : reports) {
                    System.out.println(report);
                }
            }
        } catch (ParseException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
