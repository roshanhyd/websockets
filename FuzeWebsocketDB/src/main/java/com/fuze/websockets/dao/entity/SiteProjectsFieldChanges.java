package com.fuze.websockets.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SITE_PROJECTS_FIELD_CHANGES")
public class SiteProjectsFieldChanges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SITE_PROJECTS_FIELD_CHANGES_ID")
	private Integer siteProjectsFieldChangesId;

	@Column(name = "SITE_PROJECTS_ID")
	private Integer siteProjectsId;

	@Column(name = "SITE_INFO_ID")
	private Integer siteInfoId;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "FIELD_VALUE")
	private String fieldValue;

	@Column(name = "SOURCE1")
	private String source;

	@Column(name = "LAST_MODIFIED_BY")
	private String lastModifiedBy;

	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	public SiteProjectsFieldChanges(){
		
	}
	
	public SiteProjectsFieldChanges(Integer siteProjectsId, Integer siteInfoId, String fieldName, String fieldValue,
			String source, String lastModifiedBy, Date lastModifiedDate) {
		super();
		this.siteProjectsId = siteProjectsId;
		this.siteInfoId = siteInfoId;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		this.source = source;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}


	public Integer getSiteProjectsFieldChangesId() {
		return siteProjectsFieldChangesId;
	}

	public void setSiteProjectsFieldChangesId(Integer siteProjectsFieldChangesId) {
		this.siteProjectsFieldChangesId = siteProjectsFieldChangesId;
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

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
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
		return "SiteProjectsFieldChanges [siteProjectsFieldChangesId=" + siteProjectsFieldChangesId
				+ ", siteProjectsId=" + siteProjectsId + ", siteInfoId=" + siteInfoId + ", fieldName=" + fieldName
				+ ", fieldValue=" + fieldValue + ", source=" + source + ", lastModifiedBy=" + lastModifiedBy
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}

}
