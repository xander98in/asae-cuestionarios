package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import javax.validation.constraints.NotEmpty;
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
public class PreguntaDTOPeticion {

    @NotEmpty(message = "{pregunta.enunciado.empty}")
    @Size(min = 5, max = 60, message = "{pregunta.enunciado.length}")
    private String enunciado;

    @NotEmpty(message = "{pregunta.objTipoPregunta}")
    private TipoPreguntaDTOPeticion objTipoPregunta;

}
