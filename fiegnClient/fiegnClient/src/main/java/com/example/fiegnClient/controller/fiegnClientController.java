package com.example.fiegnClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fiegnClient.util.feingServiceUtil;

@RestController
@RequestMapping("/api/venta")
public class fiegnClientController {
	
	@Autowired
	private feingServiceUtil  FeingServiceUtil;
	
	@GetMapping
	public String getProductos() {
		return FeingServiceUtil.getVenta();
	}
}
