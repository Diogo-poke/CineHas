package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enums.TipoFormaPagamentoEnum;
import jakarta.persistence.*;
import lombok.*;
//Artur Albion e Diogo Alves
@Getter
@Setter
@Entity
@Table(name = "TBL_FORMA_PAGAMENTO")
public class FormaPagamento {
    @Id // Esse campo é a chave primária na tabela
    @Column(name = "ID_FORMA_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TP_TIPO")
    @Enumerated(EnumType.STRING)
    private TipoFormaPagamentoEnum tipoFormaPagamento;
}