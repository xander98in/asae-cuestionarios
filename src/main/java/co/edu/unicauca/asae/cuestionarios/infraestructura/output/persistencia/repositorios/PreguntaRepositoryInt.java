package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.PreguntaEntity;

public interface PreguntaRepositoryInt extends CrudRepository<PreguntaEntity, Integer> {

}
