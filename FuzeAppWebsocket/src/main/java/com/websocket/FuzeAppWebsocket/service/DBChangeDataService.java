package com.websocket.FuzeAppWebsocket.service;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "fuzeWebSocketSevice", url = "${service.url}")
public interface DBChangeDataService {

	@GetMapping("${service.uri}")
	public List<Map<String, Object>> getSiteProjectFieldChanges();

}
