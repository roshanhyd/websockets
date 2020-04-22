package com.fuze.websockets.dao.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.fuze.websockets.dao.entity.SiteProjectsFieldChanges;
import com.fuze.websockets.dao.entity.PORequest;
import com.fuze.websockets.dao.entity.PORequestHistory;
import com.fuze.websockets.dao.repository.PORequestHistoryRepository;
import com.fuze.websockets.dao.repository.PORequestRepository;
import com.fuze.websockets.dao.repository.SiteProjectsFieldChangesRepository;

/**
 * @author Bhajuram.c
 *
 */
@Service
public class WebsocketDAOService {

	private static final Logger LOGGER = LogManager.getLogger(WebsocketDAOService.class);
	@Autowired
	private SiteProjectsFieldChangesRepository siteProjectsFieldChangesRepository;
	@Autowired
	private PORequestRepository poRequestRepository;
    
	public List<Map<String, Object>> getSiteProjectFieldChangesJSON() {

		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> internalMap = new HashMap<String, Object>();

		Map<String, Object> siteProjectFieldChangesReponse = getSiteProjectFieldChanges();

		Set set = siteProjectFieldChangesReponse.keySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String keyStr = (String) iter.next();
			String[] strArr = keyStr.split(":");

			String siteProjectId = strArr[0];
			String siteInfoId = strArr[1];

			internalMap = (Map<String, Object>) siteProjectFieldChangesReponse.get(keyStr);

			internalMap.put("SITE_PROJECT_ID", siteProjectId);
			internalMap.put("SITE_INFO_ID", siteInfoId);
			list.add(internalMap);
		}
		return list;

	}

	public Map<String, Object> getSiteProjectFieldChanges() {

		Map<String, Object> response = new HashMap<String, Object>();
		try {
			List<SiteProjectsFieldChanges> dbSiteProjectsFieldChanges = siteProjectsFieldChangesRepository.findAll();
			Map<String, Object> mapRes = new HashMap<String, Object>();
			if (!CollectionUtils.isEmpty(dbSiteProjectsFieldChanges)) {
				for (SiteProjectsFieldChanges row : dbSiteProjectsFieldChanges) {
					if (mapRes.containsKey(row.getSiteProjectsId() + ":" + row.getSiteInfoId())) {
						Map<String, Object> internalMap = (Map<String, Object>) mapRes
								.get(row.getSiteProjectsId() + ":" + row.getSiteInfoId());
						if (!internalMap.containsKey(row.getFieldName())) {
							internalMap.put(row.getFieldName(), row.getFieldValue());
						}
					} else {
						Map<String, Object> internalMap = new HashMap<String, Object>();
						internalMap.put(row.getFieldName(), row.getFieldValue());
						mapRes.put(row.getSiteProjectsId() + ":" + row.getSiteInfoId(), internalMap);
					}
					Map<String, Object> mapData = new HashMap<String, Object>();
					mapData.put("SITE_PROJECTS_ID", row.getSiteProjectsId());
					mapData.put("SITE_INFO_ID", row.getSiteInfoId());
					mapData.put(row.getFieldName(), row.getFieldValue());
				}
				return mapRes;
			} else {
				response.put("status", 0);
				response.put("message", "No Data Found!");
				LOGGER.info("No Data Available!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.info("Failed to load the Site Projects Field Changes.!");
		}
		return response;
	}
	
	public void createPORequest(PORequest porequest) {
		poRequestRepository.save(porequest);
		
	}
	public PORequest getPORequest(int id) {
		Optional<PORequest> poRequest = poRequestRepository.findById(id);
		if(poRequest!=null) {
			return poRequest.get();
		}
		
		return null;
	}
		
	public Map<String, Object> getLatestPoRequestHistory() {

		Map<String, Object> response = new HashMap<String, Object>();

		return response;

	}
}
