package com.silva.carlos.restaurante.controller;


import com.silva.carlos.restaurante.controller.response.ComidaResponse;
import com.silva.carlos.restaurante.service.ListarComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/comida")
public class FoodController {

    @Autowired
    private ListarComidaService listarComidaService;

    @GetMapping
    public Page<ComidaResponse> listarComidas(Pageable pageable) {
        return listarComidaService.listar(pageable);
    }
}
