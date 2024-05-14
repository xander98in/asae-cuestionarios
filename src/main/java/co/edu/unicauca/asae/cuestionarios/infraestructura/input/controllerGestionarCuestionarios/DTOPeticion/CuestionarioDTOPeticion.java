package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CuestionarioDTOPeticion {

    @NotNull(message = "{cuestionario.titulo.emply}")
    @Size(min = 5, max = 50, message = "{cuestionario.titulo.size}")
    private String titulo;

    @NotNull(message = "{cuestionario.descripcion.emply}")
    @Size(min = 5, max = 90, message = "{cuestionario.descripcion.size}")
    private String descripcion;

    private List<PreguntaDTOPeticion> preguntas;

}
