package com.dlmv.gamelist.controllers;

import com.dlmv.gamelist.dto.GameDTO;
import com.dlmv.gamelist.dto.GameMinDTO;
import com.dlmv.gamelist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dlmv.gamelist.services.GameService;

import java.util.List;

//Nosso controller é quem disponibiliza a API
@RestController
@RequestMapping(value = "/games") //Caminho que será respondido pela API
public class GameController {

    @Autowired //Injetando dependencia
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){ //Id casa com o id da request
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
