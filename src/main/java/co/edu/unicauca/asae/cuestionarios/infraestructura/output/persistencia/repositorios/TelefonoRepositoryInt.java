package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.TelefonoEntity;

public interface TelefonoRepositoryInt extends CrudRepository<TelefonoEntity, Integer> {

}
