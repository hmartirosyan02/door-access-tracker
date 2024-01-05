package com.codulate.doorsystem.server.doorsystemserver.repositories;

import com.codulate.doorsystem.server.doorsystemserver.models.StayDuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StayDurationRepository extends JpaRepository<StayDuration, Long> {
}
