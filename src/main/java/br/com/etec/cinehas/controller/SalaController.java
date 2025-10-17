package br.com.etec.cinehas.controller;

import br.com.etec.cinehas.entity.Sala;
import br.com.etec.cinehas.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/salas")
public class SalaController
{
   @Autowired
    private SalaRepository repository;


   @GetMapping
    public List<Sala> listar() {
       return repository.findAll();
   }
}
