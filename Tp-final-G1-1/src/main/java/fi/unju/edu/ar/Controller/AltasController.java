package fi.unju.edu.ar.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


	@Controller
	public class AltasController {
		
		@GetMapping("/inicio/ciudadanos/registro")
		public String getAltaCi() {
			return "altaCiudadano";
		}
		
		@GetMapping("/inicio/empleadores/registro")
		public String getAltaEmp() {
			return "altaEmpleador";
	}
	
}
