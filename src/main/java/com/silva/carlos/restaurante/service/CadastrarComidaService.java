package com.silva.carlos.restaurante.service;

import com.silva.carlos.restaurante.controller.request.ComidaRequest;
import com.silva.carlos.restaurante.controller.response.ComidaResponse;
import com.silva.carlos.restaurante.domain.Comida;
import com.silva.carlos.restaurante.mapper.ComidaMapper;
import com.silva.carlos.restaurante.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CadastrarComidaService {

    @Autowired
    private ValidaNomeUnicoService validaNomeUnicoService;

    @Autowired
    private ComidaRepository comidaRepository;

    @Transactional
    public ComidaResponse incluir(ComidaRequest request) {
        Comida comida = ComidaMapper.toEntity(request);

        validaNomeUnicoService.validar(request.getNome());

        comidaRepository.save(comida);

        return ComidaMapper.toResponse(comida);
    }
}
