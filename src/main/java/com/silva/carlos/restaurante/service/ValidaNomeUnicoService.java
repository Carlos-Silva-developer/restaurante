package com.silva.carlos.restaurante.service;

import com.silva.carlos.restaurante.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@Service
public class ValidaNomeUnicoService {

    @Autowired
    private ComidaRepository comidaRepository;

    public void validar(String nome) {
        boolean validarNomeComida = comidaRepository.existsByNome(nome);
        String mensagemErro = "Prato ja cadastrado";

        if (validarNomeComida) {
            throw new ResponseStatusException(UNPROCESSABLE_ENTITY, mensagemErro);
        }
    }
}
