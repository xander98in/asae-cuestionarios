package co.edu.unicauca.asae.cuestionarios.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Departamento {

    private Integer idDepartamento;
    private String nombreDep;
    private String descripcion;

    public Departamento() {

    }
}
