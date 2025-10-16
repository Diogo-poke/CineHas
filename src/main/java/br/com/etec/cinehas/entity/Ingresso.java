package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enums.TipoIngressoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//Artur Albion e Diogo Alves
@Getter
@Setter
@Entity
@Table(name = "TBL_INGRESSO")
public class Ingresso {
    @Id
    @Column(name = "ID_INGRESSO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NR_PRECO")
    private Double preco;
    @Column(name = "TP_INGRESSO")
    @Enumerated(EnumType.STRING)
    private TipoIngressoEnum tipoIngresso;

    @ManyToOne
    @JoinColumn(name = "ID_SESSAO")
    private Sessao sessao;

    @OneToOne
    @JoinColumn(name = "ID_ASSENTO")
    private Assento assento;

}
