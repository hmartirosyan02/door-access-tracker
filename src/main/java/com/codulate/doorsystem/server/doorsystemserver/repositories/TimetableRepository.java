package com.codulate.doorsystem.server.doorsystemserver.repositories;

import com.codulate.doorsystem.server.doorsystemserver.models.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Long> {
}
