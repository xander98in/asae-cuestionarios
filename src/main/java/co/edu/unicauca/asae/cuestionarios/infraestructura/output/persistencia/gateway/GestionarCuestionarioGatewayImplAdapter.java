package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.gateway;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.cuestionarios.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.repositorios.CuestionarioRepositoryInt;

@Service
public class GestionarCuestionarioGatewayImplAdapter implements GestionarCuestionarioGatewayIntPort {
    private final CuestionarioRepositoryInt cuestionarioRepositoryInt;
    private final ModelMapper modelMapper;

    public GestionarCuestionarioGatewayImplAdapter(CuestionarioRepositoryInt cuestionarioRepositoryInt,
            ModelMapper modelMapper) {
        this.cuestionarioRepositoryInt = cuestionarioRepositoryInt;
        this.modelMapper = modelMapper;
    }

    @Override
    public Cuestionario crearCuestionario(Cuestionario objCuestionario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCuestionario'");
    }

    @Override
    public List<Cuestionario> listarCuestionarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarCuestionarios'");
    }

}
