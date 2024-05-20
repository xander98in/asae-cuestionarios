package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.TipoPregunta;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion.TipoPreguntaDTOPeticion;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTORespuesta.CuestionarioDTORespuesta;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTORespuesta.TipoPreguntaDTORespuesta;

@Mapper(componentModel = "spring")
public interface CuestionarioMapperInfraestructuraDominio {
    Cuestionario mappearDePeticionACuestionario(CuestionarioDTOPeticion peticion);

    CuestionarioDTORespuesta mappearDeCuestionarioARespuesta(Cuestionario objCuestionario);

    TipoPreguntaDTORespuesta mappearTipoPreguntaARespuesta(TipoPregunta tipoPregunta);

    TipoPregunta mappearDePeticionATipoPregunta(TipoPreguntaDTOPeticion tipoPreguntaDTOPeticion);

    List<CuestionarioDTORespuesta> mappearDeCuestionariosARespuesta(List<Cuestionario> Cuestionarios);
}
