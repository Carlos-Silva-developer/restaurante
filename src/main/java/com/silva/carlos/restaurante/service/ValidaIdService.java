package com.silva.carlos.restaurante.service;

import com.silva.carlos.restaurante.domain.Comida;
import com.silva.carlos.restaurante.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

import java.util.Optional;

@Service
public class ValidaIdService {

    @Autowired
    private ComidaRepository comidaRepository;

    public void validarComida(Long numero) {
        Optional<Comida> encontrouComida = comidaRepository.findById(numero);
        String mensagemErro = "Prato não Encontrado";

        if (encontrouComida.isEmpty()) {
            throw new ResponseStatusException(UNPROCESSABLE_ENTITY, mensagemErro);
        }
    }
}
