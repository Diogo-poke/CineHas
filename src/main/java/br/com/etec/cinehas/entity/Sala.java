package br.com.etec.cinehas.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TBL_SALA")
public class Sala {
    @Id // Esse campo é a chave primária na tabela
    @Column(name = "ID_SALA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "NR_PRECO")
    private double preco;
}