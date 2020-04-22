package com.fuze.po.PurchaseOrderAppServices.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Bhajuram.c
 *
 */
@Entity
@Table(name = "po_request")
public class PORequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "site_projects_id")
	private int siteProjectsId;
    @Column(name = "site_info_id")
    private Integer siteInfoId;
    @Column(name ="project_name")
    private String projectName;
    @Column(name = "site_name")
    private String siteName;
	@Column(name = "po_name")
	private String poName;
	@Column(name = "pslc")
	private String pslc;
	@Column(name = "po_status")
	private String poStatus;
	@Column(name = "project_status")
	private String projectStatus;
	@Column(name = "project_type")
	private String projectType;
	@Column(name = "teritory")
	private String teritory;
	@Column(name = "market")
	private String market;
	@Column(name = "sitetracker")
	private String siteTracker;
	@Column(name = "customer_project_type")
	private String customerProjectType;
	@Column(name = "last_modified_by")
	private String lastModifiedBy;
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;

	
	public String getPslc() {
		return pslc;
	}

	public void setPslc(String pslc) {
		this.pslc = pslc;
	}

	public String getSiteTracker() {
		return siteTracker;
	}

	public void setSiteTracker(String siteTracker) {
		this.siteTracker = siteTracker;
	}

	public String getPoStatus() {
		return poStatus;
	}

	public void setPoStatus(String poStatus) {
		this.poStatus = poStatus;
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

	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}

	public int getSiteProjectsId() {
		return siteProjectsId;
	}

	public void setSiteProjectsId(int siteProjectsId) {
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

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "PORequest [siteProjectsId=" + siteProjectsId + ", siteInfoId=" + siteInfoId + ", projectName="
				+ projectName + ", siteName=" + siteName + ", poName=" + poName + ", pslc=" + pslc + ", poStatus="
				+ poStatus + ", projectStatus=" + projectStatus + ", projectType=" + projectType + ", teritory="
				+ teritory + ", market=" + market + ", siteTracker=" + siteTracker + ", customerProjectType="
				+ customerProjectType + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate
				+ "]";
	}

}
