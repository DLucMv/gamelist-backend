package com.dlmv.gamelist.services;


import com.dlmv.gamelist.dto.GameListDTO;
import com.dlmv.gamelist.entities.GameList;
import com.dlmv.gamelist.projections.GameMinProjection;
import com.dlmv.gamelist.repositories.GameListRepository;
import com.dlmv.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Nosso Service é o componente responsavél por implementar uma lógica de negócio
@Service //Resgistrando o serviço como componente do sistema
public class GameListService {

    @Autowired //Injetando dependencia
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().
                map(x -> new GameListDTO(x)).toList();
                //Obj Game -> Obj GameMinDTO
    }

    @Transactional(readOnly = true)
    public void move(Long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i < max; i++) {
            gameListRepository.
                    updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }

}
