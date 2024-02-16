package pe.edu.cibertec.DAWI_CL2_ENZO.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWI_CL2_ENZO.model.bd.Curso;
import pe.edu.cibertec.DAWI_CL2_ENZO.repository.CursoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CursoService {
    private CursoRepository cursoRepository;

    public List<Curso> listadoCursos(){return cursoRepository.findAll();}
}
