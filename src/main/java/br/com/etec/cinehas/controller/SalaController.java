package br.com.etec.cinehas.controller;

import br.com.etec.cinehas.entity.Sala;
import br.com.etec.cinehas.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
 @GetMapping("/{id}")
   public Optional<Sala> buscarPorId(@PathVariable("id") Long id)
   {
       var sala = repository.findById(id);
       if (sala.isPresent())
           return sala;
          return null;
   }
   @PostMapping
   public Sala cadastrar(@RequestBody Sala sala )
   {
      return repository.save(sala);

   }

   @PutMapping("/Id")
   public Sala alterarId(Sala sala ,Long id )
   {
      if (id == sala.getId() && buscarPorId(id).isPresent() )
      {
          return repository.save(sala);

      }
     return  null;

   }
@DeleteMapping("/Id")
   public void excluir(@PathVariable Long id)
   {
       var sala = buscarPorId(id);
       if (sala.isPresent())
       {
           repository.findById(id);
       }
   }


}
