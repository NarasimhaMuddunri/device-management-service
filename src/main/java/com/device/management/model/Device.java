package com.device.management.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "device_id")
	private long deviceId;

	@Column(name = "device_name")
	private String deviceName;

	@Column(name = "support_tech")
	private String supportTech;

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getSupportTech() {
		return supportTech;
	}

	public void setSupportTech(String supportTech) {
		this.supportTech = supportTech;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceId, deviceName, supportTech);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return deviceId == other.deviceId && Objects.equals(deviceName, other.deviceName)
				&& Objects.equals(supportTech, other.supportTech);
	}

	
	
	
}	