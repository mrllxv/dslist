package com.murilloaragao.dslist.services;

import com.murilloaragao.dslist.dto.GameListDTO;
import com.murilloaragao.dslist.entities.Game;
import com.murilloaragao.dslist.entities.GameList;
import com.murilloaragao.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//FAZ A PONTE ENTRE O ACESSO AO BANCO DE DADOS E O END POINT
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
