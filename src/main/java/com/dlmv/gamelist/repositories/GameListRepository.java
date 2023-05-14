package com.dlmv.gamelist.repositories;


import com.dlmv.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

//Nosso Repository é o componente responsavél por fazer consultas ao db.
public interface GameListRepository extends JpaRepository<GameList, Long> {
}

