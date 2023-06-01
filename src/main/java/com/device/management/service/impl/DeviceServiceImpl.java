package com.device.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.management.model.Device;
import com.device.management.pojos.RegisterDeviceRequest;
import com.device.management.pojos.RegisterDeviceResponse;
import com.device.management.repository.DeviceRepository;
import com.device.management.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	DeviceRepository deviceRepository;

	@Override
	public RegisterDeviceResponse onboardDevice(RegisterDeviceRequest registerDeviceRequest) {
		Device device = new Device();
		device.setDeviceName(registerDeviceRequest.getDeviceName());
		device.setSupportTech(registerDeviceRequest.getSupportTech());
		Device deviceResponse = deviceRepository.save(device);
		RegisterDeviceResponse registerDeviceResponse = new RegisterDeviceResponse();
		registerDeviceResponse
				.setDeviceRegisterStatus("Device Onboared successfully -deviceId is : " + deviceResponse.getDeviceId());
		return registerDeviceResponse;
	}

}
