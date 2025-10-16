package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enums.StatusPedidoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
//Artur Albion e Diogo Alves
@Getter
@Setter
@Entity
@Table(name = "TBL_PEDIDO")
public class Pedido {
    @Id
    @Column(name = "ID_PEDIDO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "DT_CRIACAO")
    private LocalDateTime data;
    @Column(name = "TP_STATUS")
    @Enumerated(EnumType.STRING)
    private StatusPedidoEnum statusPedido;
}
