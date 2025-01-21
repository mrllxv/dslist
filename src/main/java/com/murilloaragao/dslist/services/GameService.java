package com.murilloaragao.dslist.services;

import com.murilloaragao.dslist.dto.GameDTO;
import com.murilloaragao.dslist.dto.GameMinDTO;
import com.murilloaragao.dslist.entities.Game;
import com.murilloaragao.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//FAZ A PONTE ENTRE O ACESSO AO BANCO DE DADOS E O END POINT
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
