package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import java.util.List;

import javax.validation.constraints.NotEmpty;
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

    @NotEmpty(message = "{cuestionario.titulo.empty}")
    @Size(min = 5, max = 90, message = "{cuestionario.titulo.length}")
    private String titulo;

    @NotEmpty(message = "{cuestionario.descripcion.empty}")
    @Size(min = 5, max = 90, message = "{cuestionario.descripcion.length}")
    private String descripcion;

    private List<PreguntaDTOPeticion> preguntas;
}
