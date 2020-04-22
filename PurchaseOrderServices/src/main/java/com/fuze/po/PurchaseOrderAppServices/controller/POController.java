package com.fuze.po.PurchaseOrderAppServices.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuze.po.PurchaseOrderAppServices.forms.PORequestForm;
import com.fuze.po.PurchaseOrderAppServices.info.PORequestInfo;
import com.fuze.po.PurchaseOrderAppServices.info.ResponseInfo;
import com.fuze.po.PurchaseOrderAppServices.service.POService;

@RestController
@RequestMapping("/RePO")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class POController {

	private static Logger logger = LoggerFactory.getLogger(POController.class);
	@Autowired
	private POService poRequestService;

	
	@PostMapping("/createPORequest")
	public ResponseEntity<ResponseInfo> saveForm(@RequestBody final PORequestForm request) {
		return new ResponseEntity<ResponseInfo>(poRequestService.createPoRequest(request), HttpStatus.OK);
	}
	 

	@GetMapping("/getPoRequest")
	public ResponseEntity<List<PORequestInfo>> getPOItemListData() {
		return new ResponseEntity<List<PORequestInfo>>(poRequestService.getPOList(), HttpStatus.OK);
	}
	
	
	@GetMapping("/deletePoRequest/{siteProjectsId}")
	public ResponseEntity<String> deletePOItemListData(@PathVariable final int siteProjectsId) {
		String status = "failure";
		try {
			status = poRequestService.deletePOList(siteProjectsId);
		} catch (Exception e) {
			logger.error("Exception in deletePOItemListData method" + e.getMessage());
		}
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	 
}
