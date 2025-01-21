package com.murilloaragao.dslist.repositories;

import com.murilloaragao.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
