package com.device.management.service;

import com.device.management.pojos.RegisterDeviceRequest;
import com.device.management.pojos.RegisterDeviceResponse;

public interface DeviceService {

	public RegisterDeviceResponse onboardDevice(RegisterDeviceRequest registerDeviceRequest);
}
