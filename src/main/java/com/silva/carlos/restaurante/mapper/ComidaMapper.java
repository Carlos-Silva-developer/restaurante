package com.silva.carlos.restaurante.mapper;

import com.silva.carlos.restaurante.controller.request.ComidaRequest;
import com.silva.carlos.restaurante.controller.response.ComidaResponse;
import com.silva.carlos.restaurante.domain.Comida;

public class ComidaMapper {

    public static Comida toEntity(ComidaRequest request) {
        Comida comida = new Comida();
        comida.setNome(request.getNome());
        comida.setImagemUrl(request.getImagemUrl());
        comida.setPreco(request.getPreco());
        return comida;
    }

    public static ComidaResponse toResponse(Comida comida) {
        return ComidaResponse.builder()
                .id(comida.getId())
                .nome(comida.getNome())
                .imagemUrl(comida.getImagemUrl())
                .build();
    }


}
