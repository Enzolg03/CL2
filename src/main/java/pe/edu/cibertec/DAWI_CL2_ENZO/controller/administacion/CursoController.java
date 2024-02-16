package pe.edu.cibertec.DAWI_CL2_ENZO.controller.administacion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.DAWI_CL2_ENZO.service.CursoService;

@Controller
@AllArgsConstructor
@RequestMapping("/administracion/curso")
public class CursoController {
    private CursoService cursoService;
    @GetMapping("/frmcurso")
    public String curso(Model model){
        model.addAttribute("listado", cursoService.listadoCursos());
        return "/administracion/frmcurso";
    }
}
