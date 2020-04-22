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
@Table(name = "po_request_history")
public class PORequestHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "po_id")
	private int poId;
	@Column(name = "site_id")
	private int siteId;
	@Column(name = "po_name")
	private String poName;
	@Column(name = "pslc")
	private String pslc;
	@Column(name = "po_status")
	private String poStatus;
	@Column(name = "teritory")
	private String teritory;
	@Column(name = "market")
	private String market;
	@Column(name = "sitetracker")
	private String siteTracker;
	@Column(name = "last_modified_by")
	private String lastModifiedBy;
	@Column(name = "history_date")
	private Date historyDate;
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	public PORequestHistory() {}
	
	public PORequestHistory(int poId, int siteId, String poName, String pslc, String poStatus, String teritory, String market,
			String siteTracker,String lastModifiedBy,Date historyDate, Date lastModifiedDate) {
		super();
		this.poId = poId;
		this.siteId = siteId;
		this.poName = poName;
		this.pslc = pslc;
		this.poStatus = poStatus;
		this.teritory = teritory;
		this.market = market;
		this.siteTracker = siteTracker;
		this.lastModifiedBy = lastModifiedBy;
		this.historyDate = historyDate;
		this.lastModifiedDate = lastModifiedDate;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPoId() {
		return poId;
	}


	public void setPoId(int poId) {
		this.poId = poId;
	}


	public int getSiteId() {
		return siteId;
	}


	public void setSiteId(int siteId) {
		this.siteId = siteId;
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


	public String getTeritory() {
		return teritory;
	}


	public void setTeritory(String teritory) {
		this.teritory = teritory;
	}


	public String getMarket() {
		return market;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
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


	public Date getHistoryDate() {
		return historyDate;
	}


	public void setHistoryDate(Date historyDate) {
		this.historyDate = historyDate;
	}


	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}


	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}


	@Override
	public String toString() {
		return "PORequest [poId=" + poId + ", siteId=" + siteId + ", poName=" + poName + ", pslc=" + pslc
				+ ", poStatus=" + poStatus + ", teritory=" + teritory + ", market=" + market + ", siteTracker="
				+ siteTracker + ", historyDate=" + historyDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	

}
