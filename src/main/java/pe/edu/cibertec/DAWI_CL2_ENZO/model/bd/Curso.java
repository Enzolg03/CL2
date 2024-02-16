package pe.edu.cibertec.DAWI_CL2_ENZO.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="curso")
public class Curso {
    @Id
    private String idcurso;
    @Column(name = "nomcurso")
    private String nomcurso;
    @Column(name = "credito")
    private int credito;
}
