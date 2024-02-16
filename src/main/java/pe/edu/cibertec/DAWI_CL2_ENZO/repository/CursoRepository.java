package pe.edu.cibertec.DAWI_CL2_ENZO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWI_CL2_ENZO.model.bd.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, String> {

}
