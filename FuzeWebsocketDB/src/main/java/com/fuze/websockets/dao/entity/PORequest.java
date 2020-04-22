package com.fuze.websockets.dao.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/**
 * @author Bhajuram.c
 *
 */
@Entity
@Table(name = "po_request")
public class PORequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SITE_PROJECTS_ID")
	private int id;
	@Column(name = "SITE_INFO_ID")
	private int siteId;
	@Column(name = "PROJECT_NAME")
	private String projectName;
	@Column(name = "SITE_NAME")
	private String siteName;
	@Column(name = "PO_NAME")
	private String poName;
	@Column(name = "PSLC")
	private String pslc;
	@Column(name = "PO_STATUS")
	private String poStatus;
	@Column(name = "PROJECT_STATUS")
	private String projectStatus;
	@Column(name = "PROJECT_TYPE")
	private String projectType;
	@Column(name = "TERRITORY")
	private String territory;
	@Column(name = "MARKET")
	private String market;
	@Column(name = "SITETRACKER")
	private String siteTracker;
	@Column(name = "CUSTOMER_PROJECT_TYPE")
	private String customerProjectType;
	@Column(name = "LAST_MODIFIED_BY")
	private String lastModifiedBy;
	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;
	
	public PORequest() {}

	public PORequest(int siteId, String projectName, String siteName, String poName, String pslc, String poStatus,
			String projectStatus, String projectType, String territory, String market, String siteTracker,
			String customerProjectType, String lastModifiedBy, Date lastModifiedDate) {
		super();
		this.siteId = siteId;
		this.projectName = projectName;
		this.siteName = siteName;
		this.poName = poName;
		this.pslc = pslc;
		this.poStatus = poStatus;
		this.projectStatus = projectStatus;
		this.projectType = projectType;
		this.territory = territory;
		this.market = market;
		this.siteTracker = siteTracker;
		this.customerProjectType = customerProjectType;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
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

	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}

	public String getPslc() {
		return pslc;
	}

	public void setPslc(String pslc) {
		this.pslc = pslc;
	}

	public String getPoStatus() {
		return poStatus;
	}

	public void setPoStatus(String poStatus) {
		this.poStatus = poStatus;
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

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getSiteTracker() {
		return siteTracker;
	}

	public void setSiteTracker(String siteTracker) {
		this.siteTracker = siteTracker;
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

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "PORequest [siteId=" + siteId + ", projectName=" + projectName + ", siteName=" + siteName + ", poName="
				+ poName + ", pslc=" + pslc + ", poStatus=" + poStatus + ", projectStatus=" + projectStatus
				+ ", projectType=" + projectType + ", territory=" + territory + ", market=" + market + ", siteTracker="
				+ siteTracker + ", customerProjectType=" + customerProjectType + ", lastModifiedBy=" + lastModifiedBy
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	
	
	
	}
