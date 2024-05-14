package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoPreguntaDTOPeticion {
    @NotNull(message = "{tipopregunta.idtipopregunta.emply}")
    private Integer idTipoPregunta;

}
