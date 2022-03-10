package com.lucasmezencio.dsmovie.controllers;

import com.lucasmezencio.dsmovie.dto.MovieDTO;
import com.lucasmezencio.dsmovie.dto.ScoreDTO;
import com.lucasmezencio.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        return service.saveScore(dto);
    }
}
