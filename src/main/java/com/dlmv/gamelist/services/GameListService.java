package com.dlmv.gamelist.services;


import com.dlmv.gamelist.dto.GameListDTO;
import com.dlmv.gamelist.entities.GameList;
import com.dlmv.gamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Nosso Service é o componente responsavél por implementar uma lógica de negócio
@Service //Resgistrando o serviço como componente do sistema
public class GameListService {

    @Autowired //Injetando dependencia
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().
                map(x -> new GameListDTO(x)).toList();
                //Obj Game -> Obj GameMinDTO
    }

}
