package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PreguntaDTOPeticion {

    @NotEmpty(message = "{pregunta.enunciado.empty}")
    @Size(min = 10, max = 60, message = "{pregunta.enunciado.size}")
    private String enunciado;
    @NotNull(message = "{pregunta.tipopregunta.null")
    private TipoPreguntaDTOPeticion objTipoPregunta;

}
