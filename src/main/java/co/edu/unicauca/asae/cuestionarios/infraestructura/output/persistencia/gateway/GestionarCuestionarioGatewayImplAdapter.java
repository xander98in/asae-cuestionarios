package co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.gateway;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.cuestionarios.aplicacion.output.GestionarCuestionarioGatewayIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.infraestructura.output.persistencia.entidades.CuestionarioEntity;
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
    public Boolean existeCuestionarioPorTitulo(String titulo) {
        return this.cuestionarioRepositoryInt.existePorTitulo(titulo);
    }

    @Override
    public Cuestionario crearCuestionario(Cuestionario objCuestionario) {
        CuestionarioEntity objCuestionarioEntity = this.modelMapper.map(objCuestionario, CuestionarioEntity.class);
        CuestionarioEntity objCuestionarioEntityRegistrado = this.cuestionarioRepositoryInt.save(objCuestionarioEntity);
        return this.modelMapper.map(objCuestionarioEntityRegistrado, Cuestionario.class);
    }

    @Override
    public List<Cuestionario> listarCuestionarios() {
        Iterable<CuestionarioEntity> lista = this.cuestionarioRepositoryInt.findAll();
        List<Cuestionario> listaObtenida = this.modelMapper.map(lista, new TypeToken<List<Cuestionario>>() {
        }.getType());
        return listaObtenida;
    }

}
