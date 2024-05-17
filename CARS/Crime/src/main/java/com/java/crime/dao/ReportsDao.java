package com.java.crime.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import com.java.crime.model.Reports;

public interface ReportsDao {
    Boolean createReport(Reports report) throws ClassNotFoundException, SQLException;
    List<Reports> showReportById(int reportId) throws ClassNotFoundException, SQLException;
    List<Reports> showReportByReportingOfficer(int officerId) throws ClassNotFoundException, SQLException;
    List<Reports> showReportByStatus(String status) throws ClassNotFoundException, SQLException;
    List<Reports> showReportByDate(Date date) throws ClassNotFoundException, SQLException;
}
