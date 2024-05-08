package co.edu.unicauca.asae.cuestionarios.cuestionarios.infraestructura.output.persistencia.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class DocenteEntity {

    @Column(length = 30, nullable = false)
    private String correo;

    @Column(length = 30)
    private String vinculacion;

    @OneToOne(cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, mappedBy = "objPersona")
    private TelefonoEntity objTelefono;

    @ManyToMany(cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinTable(name = "departamentos-docentes",
                joinColumns = @JoinColumn(name = "id_persona"),
                inverseJoinColumns = @JoinColumn(name = "id_departamento"))
    private List<DepartamentoEntity> departamentos;

    @OneToMany(cascade = { CascadeType.REMOVE }, fetch = FetchType.EAGER, mappedBy = "objDocente")
    private List<RespuestaEntity> respuestas;

}
