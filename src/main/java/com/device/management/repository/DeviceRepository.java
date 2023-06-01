package com.device.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.device.management.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
