package com.websocket.FuzeAppWebsocket.scheduler;

import java.util.List;
import java.util.Map;

import org.apache.tomcat.jni.Time;
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
	
	@Scheduled(fixedDelayString = "${schedular.delay.time}")
	public void getSiteProjectFieldChanges() {
		try {
			List<Map<String, Object>> projectInfo = dbChangeService.getSiteProjectFieldChanges();
			if(null!=projectInfo) {
				System.out.println("Data received from API "+projectInfo);
				template.convertAndSend("/project/data", projectInfo);
				System.out.println("Data sent to websocket server at "+new Time());
			} else {
				System.out.println("No data received from API");
			}
		} catch (Exception e) {
			System.out.println("Getting API Exception: "+e.getMessage());
		}
	}
}
