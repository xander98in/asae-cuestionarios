package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.mappers;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTORespuesta.CuestionarioDTORespuesta;

@Mapper(componentModel = "spring")
public interface CuestionarioMapperInfraestructuraDominio {

    Cuestionario mappearDePeticionACuestionario(CuestionarioDTOPeticion peticion);

    CuestionarioDTORespuesta mappearDeCuestionarioARespuesta(Cuestionario objCuestionario);

}
