package com.java.crime.model;

import java.util.Date;
import java.util.Objects;

public class Reports {
	private int ReportId;
	private int IncidentId;
	private int ReportingOfficer;
	private Date ReportDate;
	private String ReportDetails;
	private String Status;

	public int getReportId() {
		return ReportId;
	}


	public void setReportId(int reportId) {
		ReportId = reportId;
	}


	public int getIncidentId() {
		return IncidentId;
	}


	public void setIncidentId(int incidentId) {
		IncidentId = incidentId;
	}


	public int getReportingOfficer() {
		return ReportingOfficer;
	}


	public void setReportingOfficer(int reportingOfficer) {
		ReportingOfficer = reportingOfficer;
	}


	public Date getReportDate() {
		return ReportDate;
	}


	public void setReportDate(Date reportDate) {
		ReportDate = reportDate;
	}


	public String getReportDetails() {
		return ReportDetails;
	}


	public void setReportDetails(String reportDetails) {
		ReportDetails = reportDetails;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	@Override
	public String toString() {
		return "Reports [ReportId=" + ReportId + ", IncidentId=" + IncidentId + ", ReportingOfficer=" + ReportingOfficer
				+ ", ReportDate=" + ReportDate + ", ReportDetails=" + ReportDetails + ", Status=" + Status + "]";
	}


	public Reports() {
		// TODO Auto-generated constructor stub
	}


	public Reports(int reportId, int incidentId, int reportingOfficer, Date reportDate, String reportDetails,
			String status) {
		ReportId = reportId;
		IncidentId = incidentId;
		ReportingOfficer = reportingOfficer;
		ReportDate = reportDate;
		ReportDetails = reportDetails;
		Status = status;
	}
	@Override
    public int hashCode() {
        return Objects.hash(ReportId, IncidentId, ReportingOfficer, ReportDate, ReportDetails, Status);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Reports report = (Reports) obj;
        return ReportId == report.ReportId &&
                IncidentId == report.IncidentId &&
                ReportingOfficer == report.ReportingOfficer &&
                Objects.equals(ReportDate, report.ReportDate) &&
                Objects.equals(ReportDetails, report.ReportDetails) &&
                Objects.equals(Status, report.Status);
    }

	
}
