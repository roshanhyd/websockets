package com.websocket.FuzeAppWebsocket.scheduler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.websocket.FuzeAppWebsocket.service.DBChangeDataService;

@EnableScheduling
@Configuration
public class SchedulingService {
	
	
	@Autowired
	private DBChangeDataService dbChangeService;

	@Autowired
	private SimpMessagingTemplate template;

	@Autowired
	private Environment env;

	
	@Scheduled(fixedDelayString = "${schedular.delay.time}")
	public void getSiteProjectFieldChanges() {
		try {
			List<Map<String, Object>> projectInfo = dbChangeService.getSiteProjectFieldChanges();
			template.convertAndSend("/project/data", projectInfo);
		} catch (Exception e) {

		}
	}
}
