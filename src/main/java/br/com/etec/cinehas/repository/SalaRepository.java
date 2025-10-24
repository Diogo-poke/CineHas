package br.com.etec.cinehas.repository;

import br.com.etec.cinehas.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SalaRepository extends JpaRepository<Sala, Long>
{



}
