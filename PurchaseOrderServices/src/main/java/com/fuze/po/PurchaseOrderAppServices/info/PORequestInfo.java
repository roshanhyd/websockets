package com.fuze.po.PurchaseOrderAppServices.info;

import java.sql.Timestamp;

/**
 * @author Bhajuram.c
 *
 */
public class PORequestInfo {

	private Integer siteProjectsId;
	private Integer siteInfoId;
	private String projectName;
	private String siteName;
	private String pslc;
	private String poName;
	private String teritory;
	private String market;
	private String poStatus;
	private String siteTracker;
	private String projectStatus;
	private String projectType;
	private String customerProjectType;
	private String lastModifiedBy;
	private String lastModifiedDate;
	

	public String getPslc() {
		return pslc;
	}

	public void setPslc(String pslc) {
		this.pslc = pslc;
	}

	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}

	public String getTeritory() {
		return teritory;
	}

	public void setTeritory(String teritory) {
		this.teritory = teritory;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getPoStatus() {
		return poStatus;
	}

	public void setPoStatus(String poStatus) {
		this.poStatus = poStatus;
	}

	public String getSiteTracker() {
		return siteTracker;
	}

	public void setSiteTracker(String siteTracker) {
		this.siteTracker = siteTracker;
	}

	public Integer getSiteProjectsId() {
		return siteProjectsId;
	}

	public void setSiteProjectsId(Integer siteProjectsId) {
		this.siteProjectsId = siteProjectsId;
	}

	public Integer getSiteInfoId() {
		return siteInfoId;
	}

	public void setSiteInfoId(Integer siteInfoId) {
		this.siteInfoId = siteInfoId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getCustomerProjectType() {
		return customerProjectType;
	}

	public void setCustomerProjectType(String customerProjectType) {
		this.customerProjectType = customerProjectType;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
