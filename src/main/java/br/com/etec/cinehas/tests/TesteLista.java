package br.com.etec.cinehas.tests;

import br.com.etec.cinehas.entity.Sala;

import java.util.ArrayList;
import java.util.List;
//Artur Albion e Diogo Alves
public class TesteLista {
    public static void main(String[] args) {
        // Tipo Nome
        List<String> nomes = new ArrayList<>();
        List<Sala> salas = new ArrayList<>();
        nomes.add("Paulo");
        nomes.add("Ana");
        System.out.println(nomes);
        Sala sala = new Sala();
        sala.setId(1);
        sala.setNome("XD");
        sala.setPreco(30.0);
        salas.add(sala);
        System.out.println(salas.size());
        for (Sala s : salas) {
            System.out.println(s.getNome());
        }
    }
}
