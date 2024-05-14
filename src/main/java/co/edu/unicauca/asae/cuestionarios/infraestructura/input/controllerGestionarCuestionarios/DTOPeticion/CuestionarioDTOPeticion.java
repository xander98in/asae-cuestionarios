package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CuestionarioDTOPeticion {

    @NotNull
    @Size(min = 5, max = 90, message = "{}")
    private String titulo;

    @NotNull(message = "{}")
    @Size(min = 5, max = 90, message = "{}")
    private String descripcion;

    private List<PreguntaDTOPeticion> preguntas;

}
