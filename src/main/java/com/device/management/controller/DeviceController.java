package com.device.management.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.device.management.core.Response;
import com.device.management.pojos.RegisterDeviceRequest;
import com.device.management.pojos.RegisterDeviceResponse;
import com.device.management.service.DeviceService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@RestController
@RequestMapping("/device")
public class DeviceController {

	private static final Log logger = LogFactory.getLog(DeviceController.class);
	
	@Autowired
	DeviceService deviceService;
	
	
	/**
	 * Onboarding the device into system
	 * @param addProductRequest {@link registerDeviceRequest}
	 * @return {@link Response}<{@link RegisterDeviceResponse}>
	 * @throws {@link Exception}
	 */
	@PostMapping(value = "/onboard", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@JsonInclude(value = Include.NON_ABSENT)
	public @ResponseBody Response<RegisterDeviceResponse> createOrder(@RequestBody RegisterDeviceRequest registerDeviceRequest)
			throws Exception{
		logger.info("OrderManagementController - createOrder start.");
		try {
			logger.info("OrderManagementController - createOrder end.");
			return Response.createSuccessResponse(deviceService.onboardDevice(registerDeviceRequest));
		} catch (Exception excep) {
			logger.error("OrderManagementController - createOrder - ProductException : ", excep);
			throw new Exception(excep.getMessage());
		}
	}
	

}
