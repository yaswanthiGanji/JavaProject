package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;
import com.java.crime.model.Reports;

public class ShowReportByReportingOfficer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Reporting Officer ID: ");
        int reportingOfficerId = scanner.nextInt();

        ReportsDao dao = new ReportsDaoImpl();
        try {
            List<Reports> reports = dao.showReportByReportingOfficer(reportingOfficerId);

            if (reports.isEmpty()) {
                System.out.println("No reports found for the specified reporting officer.");
            } else {
                System.out.println("Reports for the specified reporting officer:");
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
