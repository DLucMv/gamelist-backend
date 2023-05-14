package com.dlmv.gamelist.dto;

import com.dlmv.gamelist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){
        super();
    }

    public GameListDTO(GameList entitiy) {
        id = entitiy.getId();
        name = entitiy.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
