package com.example.fiegnClient.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="producto", url="http://localhost:8080")
public interface feingServiceUtil {
	
	@GetMapping("api/productos")
	String getVenta();
}
