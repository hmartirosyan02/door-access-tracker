package com.codulate.doorsystem.server.doorsystemserver.repositories;

import com.codulate.doorsystem.server.doorsystemserver.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
