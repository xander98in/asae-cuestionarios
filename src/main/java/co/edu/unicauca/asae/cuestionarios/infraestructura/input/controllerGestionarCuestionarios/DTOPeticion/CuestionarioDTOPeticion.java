package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CuestionarioDTOPeticion {
    @NotNull(message = "{}")
    @Size(min = 5, max = 90, message = "{}")
    private String titulo;
    @NotNull(message = "{}")
    @Size(min = 5, max = 90, message = "{}")
    private String descripcion;
    private List<PreguntaDTOPeticion> preguntas;
}
