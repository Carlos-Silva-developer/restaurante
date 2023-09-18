package com.silva.carlos.restaurante.controller;


import com.silva.carlos.restaurante.controller.request.ComidaRequest;
import com.silva.carlos.restaurante.controller.response.ComidaResponse;
import com.silva.carlos.restaurante.service.CadastrarComidaService;
import com.silva.carlos.restaurante.service.ListarComidaService;
import com.silva.carlos.restaurante.service.RemovarComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/comida")
public class ComidaController {

    @Autowired
    private ListarComidaService listarComidaService;

    @Autowired
    private CadastrarComidaService cadastrarComidaService;

    @Autowired
    public RemovarComidaService removarComidaService;

    @GetMapping
    public Page<ComidaResponse> listarComidas(Pageable pageable) {

        return listarComidaService.listar(pageable);
    }

    //TODO - ROLE ADM - Apenas dms podem cadastrar novos pratos
    @PostMapping("/cadastrar")
    @ResponseStatus(CREATED)
                            // TODO - VALIDAÇÕES
    public ComidaResponse cadastrar(@RequestBody ComidaRequest request) {
        return cadastrarComidaService.incluir(request);
    }

    //TODO @Secured - criar anotations

    @PutMapping

    @DeleteMapping("/{comidaId}/remover")
    public void removarComidaService(@PathVariable Long comidaId) {
        removarComidaService.remover(comidaId);
    }
}
