package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.CuestionarioEntity;

public interface CuestionarioRepositoryInt extends CrudRepository<CuestionarioEntity, Integer> {
    @Query("SELECT COUNT(c) > 0 FROM CuestionarioEntity c WHERE c.titulo = :titulo")
    Boolean existePorTitulo(String titulo);

    // obteniene los cuestionarios por un patrón del título, ignorando mayúsculas y
    // minúsculas y ordenándolas por el id de mayor a menor
    List<CuestionarioEntity> findAllByTituloContainingIgnoreCaseOrderByIdCuestionarioDesc(String titulo);
}
