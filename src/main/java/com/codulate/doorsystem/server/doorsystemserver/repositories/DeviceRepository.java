package com.codulate.doorsystem.server.doorsystemserver.repositories;

import com.codulate.doorsystem.server.doorsystemserver.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
