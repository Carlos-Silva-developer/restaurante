package com.silva.carlos.restaurante.domain;

import jakarta.persistence.*;
import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Comida {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column
    private String imagemUrl;

    @Column
    private Double preco;
}
