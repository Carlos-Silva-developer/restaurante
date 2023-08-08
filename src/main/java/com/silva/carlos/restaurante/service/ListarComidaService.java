package com.silva.carlos.restaurante.service;

import com.silva.carlos.restaurante.controller.response.ComidaResponse;
import com.silva.carlos.restaurante.domain.Comida;
import com.silva.carlos.restaurante.mapper.ComidaMapper;
import com.silva.carlos.restaurante.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;


@Service
public class ListarComidaService {

    @Autowired
    private ComidaRepository comidaRepository;

    public Page<ComidaResponse> listar(Pageable pageable) {
        Page<Comida> comidas = comidaRepository.findAll(pageable);
        Page<ComidaResponse> response = comidas.map(comida -> ComidaMapper.toResponse(comida));
        return response;
    }
}
