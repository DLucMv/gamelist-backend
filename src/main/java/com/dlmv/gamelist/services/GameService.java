package com.dlmv.gamelist.services;

import com.dlmv.gamelist.dto.GameDTO;
import com.dlmv.gamelist.dto.GameMinDTO;
import com.dlmv.gamelist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dlmv.gamelist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Nosso Service é o componente responsavél por implementar uma lógica de negócio
@Service //Resgistrando o serviço como componente do sistema
public class GameService {

    @Autowired //Injetando dependencia
    private GameRepository gameRepository;

    @Transactional(readOnly = true) //Não bloqueia o bd p/ escrita
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().
                map(x -> new GameMinDTO(x)).toList();
                //Obj Game -> Obj GameMinDTO
        return dto;
    }

}
