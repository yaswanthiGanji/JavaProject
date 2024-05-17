package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;
import com.java.crime.model.Reports;

public class ShowReportById {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Report ID: ");
        int reportId = scanner.nextInt();

        ReportsDao dao = new ReportsDaoImpl();
        try {
            List<Reports> reports = dao.showReportById(reportId);
            if (reports.isEmpty()) {
                System.out.println("No report found for ID: " + reportId);
            } else {
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
