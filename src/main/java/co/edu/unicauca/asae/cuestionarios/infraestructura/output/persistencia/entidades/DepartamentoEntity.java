package co.edu.unicauca.asae.cuestionarios.cuestionarios.infraestructura.output.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DepartamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "nombre_dep", length = 30, nullable = false)
    private String nombreDep;

    @Column(length = 30)
    private String descripcion;
}
