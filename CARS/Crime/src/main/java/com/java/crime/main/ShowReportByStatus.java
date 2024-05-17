package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;
import com.java.crime.model.Reports;

public class ShowReportByStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Status: ");
        String status = scanner.next();

        ReportsDao dao = new ReportsDaoImpl();
        try {
            List<Reports> reports = dao.showReportByStatus(status);

            if (reports.isEmpty()) {
                System.out.println("No reports found for the specified status.");
            } else {
                System.out.println("Reports for the specified status:");
                for (Reports report : reports) {
                    System.out.println(report);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
