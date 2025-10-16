package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enums.StatusPagamentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//Artur Albion e Diogo Alves
@Getter
@Setter
@Entity
@Table(name = "TBL_PAGAMENTO")
public class Pagamento {
    @Id
    @Column(name = "ID_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NR_VALOR")
    private double valor;
    @Column(name = "TP_STATUS")
    @Enumerated(EnumType.STRING)
    private StatusPagamentoEnum statusPagamentoEnum;

    @OneToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;
    @OneToOne
    @JoinColumn(name = "ID_FORMA_PAGAMENTO")
    private FormaPagamento formaPagamento;
}