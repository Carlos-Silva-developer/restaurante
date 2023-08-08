package com.silva.carlos.restaurante.controller.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@JsonInclude(NON_NULL)
public class ComidaResponse {
    private Long id;
    private String nome;
    private String imagemUrl;
    private Double preco;
}
