package com.dlmv.gamelist.repositories;


import com.dlmv.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Nosso Repository é o componente responsavél por fazer consultas ao db.
public interface GameRepository extends JpaRepository<Game, Long> {
}

