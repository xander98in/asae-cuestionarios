package co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.cuestionarios.aplicacion.input.GestionarCuestionarioCUIntPort;
import co.edu.unicauca.asae.cuestionarios.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.DTORespuesta.CuestionarioDTORespuesta;
import co.edu.unicauca.asae.cuestionarios.infraestructura.input.controllerGestionarCuestionarios.mappers.CuestionarioMapperInfraestructuraDominio;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cuestionarios")
@RequiredArgsConstructor
public class CuestionarioRestController {
    private final GestionarCuestionarioCUIntPort objGestionarCuestionariosCUInt;
    private final CuestionarioMapperInfraestructuraDominio objMapeador;

    @PostMapping("/crear_cuestionario")
    public ResponseEntity<CuestionarioDTORespuesta> crearCuestionario(
            @RequestBody CuestionarioDTOPeticion objCuestionario) {
        Cuestionario objCuestionarioCrear = objMapeador.mappearDePeticionACuestionario(objCuestionario);
        Cuestionario objCuestionarioCreado = objGestionarCuestionariosCUInt.crearCuestionario(objCuestionarioCrear);
        ResponseEntity<CuestionarioDTORespuesta> objRespuesta = new ResponseEntity<CuestionarioDTORespuesta>(
                objMapeador.mappearDeCuestionarioARespuesta(objCuestionarioCreado),
                HttpStatus.CREATED);
        return objRespuesta;
    }

    @GetMapping("/obtener_cuestionarios")
    public ResponseEntity<List<CuestionarioDTORespuesta>> listar() {
        ResponseEntity<List<CuestionarioDTORespuesta>> objRespuesta = new ResponseEntity<List<CuestionarioDTORespuesta>>(
                objMapeador.mappearDeCuestionariosARespuesta(this.objGestionarCuestionariosCUInt.listarCuestionarios()),
                HttpStatus.OK);
        return objRespuesta;
    }
}
