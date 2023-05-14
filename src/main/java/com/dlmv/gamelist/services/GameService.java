package com.dlmv.gamelist.services;

import com.dlmv.gamelist.dto.GameDTO;
import com.dlmv.gamelist.dto.GameMinDTO;
import com.dlmv.gamelist.entities.Game;
import com.dlmv.gamelist.projections.GameMinProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dlmv.gamelist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Nosso Service é o componente responsavél por implementar uma lógica de negócio
@Service //Resgistrando o serviço como componente do sistema
public class GameService {

    @Autowired //Injetando dependencia
    private GameRepository gameRepository;

    @Transactional(readOnly = true) //Não bloqueia o bd p/ escrita
    public GameDTO findById(@PathVariable Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().
                map(x -> new GameMinDTO(x)).toList();
                //Obj Game -> Obj GameMinDTO
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMinDTO> dto = result.stream().
                map(x -> new GameMinDTO(x)).toList();
        //Obj Game -> Obj GameMinDTO
        return dto;
    }

}
