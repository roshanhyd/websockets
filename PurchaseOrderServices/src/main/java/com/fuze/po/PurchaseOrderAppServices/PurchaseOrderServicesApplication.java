package com.fuze.po.PurchaseOrderAppServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Bhajuram.c
 *
 */
@SpringBootApplication
public class PurchaseOrderServicesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseOrderServicesApplication.class, args);
		System.out.println("PO Service Started");
	}
}
