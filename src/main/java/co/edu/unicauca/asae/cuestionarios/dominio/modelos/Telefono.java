package co.edu.unicauca.asae.cuestionarios.dominio.modelos;

import co.edu.unicauca.asae.cuestionarios.dominio.commons.enums.TipoTelefono;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Telefono {

    private Integer idTelefono;
    private TipoTelefono tipoTelefono;
    private String numero;
    private Docente objPersona;

    public Telefono() {

    }
}
