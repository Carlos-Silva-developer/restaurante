package com.silva.carlos.restaurante.controller;


import com.silva.carlos.restaurante.controller.request.ComidaRequest;
import com.silva.carlos.restaurante.controller.response.ComidaResponse;
import com.silva.carlos.restaurante.service.CadastrarComidaService;
import com.silva.carlos.restaurante.service.ListarComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/comida")
public class FoodController {

    @Autowired
    private ListarComidaService listarComidaService;

    @Autowired
    private CadastrarComidaService cadastrarComidaService;

    @GetMapping
    public Page<ComidaResponse> listarComidas(Pageable pageable) {
        return listarComidaService.listar(pageable);
    }

    //TODO role adm
    @PostMapping
    @ResponseStatus(CREATED)
                            // TODO @Valid
    public ComidaResponse cadastrar(@RequestBody ComidaRequest request) {
        return cadastrarComidaService.incluir(request);
    }
}
