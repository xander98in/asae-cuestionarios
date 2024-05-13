package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.TipoPreguntaEntity;

public interface TipoPreguntaRepositoryInt extends CrudRepository<TipoPreguntaEntity, Integer> {

}
