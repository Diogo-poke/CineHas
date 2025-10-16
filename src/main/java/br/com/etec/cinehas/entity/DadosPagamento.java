package br.com.etec.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//Artur Albion e Diogo Alves
@Getter
@Setter
@Entity
@Table(name = "TBL_DADOS_CARTAO")
public class DadosPagamento {
    @Id
    @Column(name = "ID_DADOS_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TX_NUMERO")
    private String numero;
    @Column(name = "TX_EXPIRACAO")
    private String expiracao;
    @Column(name = "TX_CODIGO")
    private String codigo;
}
