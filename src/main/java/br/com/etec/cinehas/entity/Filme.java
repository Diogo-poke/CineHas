package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enums.ClassificacaoIndicativaEnum;
import br.com.etec.cinehas.enums.GeneroEnum;
import jakarta.persistence.*;
import lombok.*;
//Artur Albion e Diogo Alves
@Getter
@Setter
@Entity
@Table(name = "TBL_FILME")
public class Filme {
    @Id
    @Column(name = "ID_FILME")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "NR_DURACAO")
    private Integer duracao;
    @Column(name = "TP_GENERO")
    @Enumerated(EnumType.STRING)
    private GeneroEnum genero;
    @Column(name = "TP_CLASSIFICACAO")
    @Enumerated(EnumType.STRING)
    private ClassificacaoIndicativaEnum classificacaoIndicativa;
    @Column(name = "NR_ANO")
    private Integer ano;
    @Column(name = "TX_CAPA")
    private String capa;
    @Column(name = "TX_DIRETOR")
    private String diretor;
    @Column(name = "TX_ELENCO")
    private String elenco;
    @Column(name = "TX_DESCRICAO")
    private String descricao;
    @Column(name = "NR_AVALIACAO")
    private float avaliacao;
}
