package com.silva.carlos.restaurante.service;

import com.silva.carlos.restaurante.domain.Comida;
import com.silva.carlos.restaurante.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RemovarComidaService {

    @Autowired
    private ComidaRepository comidaRepository;

    public void remover(Long id) {
        Optional<Comida> comida = comidaRepository.findById(id);


        if (comida.isEmpty()) return ;
        comidaRepository.deleteById(id);
    }

}
