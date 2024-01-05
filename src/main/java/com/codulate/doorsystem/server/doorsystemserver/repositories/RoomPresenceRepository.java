package com.codulate.doorsystem.server.doorsystemserver.repositories;

import com.codulate.doorsystem.server.doorsystemserver.models.RoomPresence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomPresenceRepository extends JpaRepository<RoomPresence, Long> {
}
