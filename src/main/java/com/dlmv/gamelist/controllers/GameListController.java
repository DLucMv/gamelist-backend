package com.dlmv.gamelist.controllers;

import com.dlmv.gamelist.dto.GameListDTO;
import com.dlmv.gamelist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Nosso controller é quem disponibiliza a API
@RestController
@RequestMapping(value = "/lists") //Caminho que será respondido pela API
public class GameListController {

    @Autowired //Injetando dependencia
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
