package com.silva.carlos.restaurante.domain;

import com.silva.carlos.restaurante.domain.enums.Pagamento;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Pedido {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome_cliente", nullable = false)
    private String nomeCliente;

    @Column(name = "valor_conta", nullable = false)
    private String valorConte;

    @Column(name = "pagamento", nullable = false)
    private Pagamento pagamento;

}
