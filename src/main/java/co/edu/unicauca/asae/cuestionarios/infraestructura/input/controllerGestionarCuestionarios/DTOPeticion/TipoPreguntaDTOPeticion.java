package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoPreguntaDTOPeticion {

    @NotNull(message = "{tipo_pregunta.id_tipo_pregunta.empty}")
    @Positive(message = "{tipo_pregunta.id_tipo_pregunta.positive}")
    private Integer idTipoPregunta;

}
