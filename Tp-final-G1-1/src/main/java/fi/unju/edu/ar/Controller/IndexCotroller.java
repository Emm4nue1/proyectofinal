package fi.unju.edu.ar.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexCotroller {
	@GetMapping("/inicio")
	public String getIndex() {
		return "index";
	}
	
	
	@GetMapping ("inicio/ciudadanos")
	public String getIndexCi() {
		return "indexCiudadanos";
	}
	
	@GetMapping ("inicio/empleadores")
	public String getIndexEmp() {
		return "indexEmpleadores";
	}
	
}
