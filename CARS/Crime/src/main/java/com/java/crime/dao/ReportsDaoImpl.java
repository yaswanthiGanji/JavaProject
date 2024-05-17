package com.java.crime.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.crime.model.Reports;
import com.java.crime.util.DBConnUtil;
import com.java.crime.util.DBPropertyUtil;

public class ReportsDaoImpl implements ReportsDao {
    Connection connection;
    PreparedStatement pst;

    @Override
    public List<Reports> showReportById(int reportId) throws ClassNotFoundException, SQLException {
        String connStr = DBPropertyUtil.connectionString("db");
        connection = DBConnUtil.getConnection(connStr);
        String cmd = "SELECT * FROM Reports WHERE ReportId = ?";
        pst = connection.prepareStatement(cmd);
        pst.setInt(1, reportId);
        ResultSet rs = pst.executeQuery();
        List<Reports> reports = new ArrayList<>();
        while (rs.next()) {
            Reports report = new Reports();
            report.setReportId(rs.getInt("ReportId"));
            report.setIncidentId(rs.getInt("IncidentId"));
            report.setReportingOfficer(rs.getInt("ReportingOfficer"));
            report.setReportDate(rs.getDate("ReportDate"));
            report.setReportDetails(rs.getString("ReportDetails"));
            report.setStatus(rs.getString("Status"));
            reports.add(report);
        }
        return reports;
    }

    @Override
    public List<Reports> showReportByReportingOfficer(int reportingOfficerId) throws ClassNotFoundException, SQLException {
        List<Reports> reportsList = new ArrayList<>();
        try {
            String connStr = DBPropertyUtil.connectionString("db");
            connection = DBConnUtil.getConnection(connStr);
            String cmd = "SELECT * FROM Reports WHERE ReportingOfficer = ?";
            pst = connection.prepareStatement(cmd);
            pst.setInt(1, reportingOfficerId);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Reports report = new Reports();
                report.setReportId(rs.getInt("ReportId"));
                report.setIncidentId(rs.getInt("IncidentId"));
                report.setReportingOfficer(rs.getInt("ReportingOfficer"));
                report.setReportDate(rs.getDate("ReportDate"));
                report.setReportDetails(rs.getString("ReportDetails"));
                report.setStatus(rs.getString("Status"));
                reportsList.add(report);
            }
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return reportsList;
    }

    @Override
    public List<Reports> showReportByStatus(String status) throws ClassNotFoundException, SQLException {
        List<Reports> reportsList = new ArrayList<>();
        try {
            String connStr = DBPropertyUtil.connectionString("db");
            connection = DBConnUtil.getConnection(connStr);
            String cmd = "SELECT * FROM Reports WHERE Status = ?";
            pst = connection.prepareStatement(cmd);
            pst.setString(1, status);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Reports report = new Reports();
                report.setReportId(rs.getInt("ReportId"));
                report.setIncidentId(rs.getInt("IncidentId"));
                report.setReportingOfficer(rs.getInt("ReportingOfficer"));
                report.setReportDate(rs.getDate("ReportDate"));
                report.setReportDetails(rs.getString("ReportDetails"));
                report.setStatus(rs.getString("Status"));
                reportsList.add(report);
            }
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return reportsList;
    }

	@Override
    public List<Reports> showReportByDate(Date date) throws ClassNotFoundException, SQLException {
        List<Reports> reportsList = new ArrayList<>();
        try {
            String connStr = DBPropertyUtil.connectionString("db");
            connection = DBConnUtil.getConnection(connStr);
            String cmd = "SELECT * FROM Reports WHERE ReportDate = ?";
            pst = connection.prepareStatement(cmd);
            pst.setDate(1, date);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Reports report = new Reports();
                report.setReportId(rs.getInt("ReportId"));
                report.setIncidentId(rs.getInt("IncidentId"));
                report.setReportingOfficer(rs.getInt("ReportingOfficer"));
                report.setReportDate(rs.getDate("ReportDate"));
                report.setReportDetails(rs.getString("ReportDetails"));
                report.setStatus(rs.getString("Status"));
                reportsList.add(report);
            }
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return reportsList;
    }

	@Override
	public Boolean createReport(Reports report) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	}
	

    