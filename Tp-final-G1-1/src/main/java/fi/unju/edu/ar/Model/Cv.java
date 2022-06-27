package fi.unju.edu.ar.Model;

public class Cv {
	private String dniCV;//datos de identidad
	private int telefonoCV;
	private String educacion;
	private String idiomas;
	private String expLaboral;
	private String conInf;//conocimientos informaticos
	private String infCompl;//informacion complementaria
	private String datosAdi;//datos adicionales
	
	public Cv() {}

	public Cv(String dniCV, int telefonoCV, String educacion, String idiomas, String expLaboral, String conInf,
			String infCompl, String datosAdi) {
		super();
		this.dniCV = dniCV;
		this.telefonoCV = telefonoCV;
		this.educacion = educacion;
		this.idiomas = idiomas;
		this.expLaboral = expLaboral;
		this.conInf = conInf;
		this.infCompl = infCompl;
		this.datosAdi = datosAdi;
	}

	public String getDniCV() {
		return dniCV;
	}

	public void setDniCV(String dniCV) {
		this.dniCV = dniCV;
	}

	public int getTelefonoCV() {
		return telefonoCV;
	}

	public void setTelefonoCV(int telefonoCV) {
		this.telefonoCV = telefonoCV;
	}

	public String getEducacion() {
		return educacion;
	}

	public void setEducacion(String educacion) {
		this.educacion = educacion;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getExpLaboral() {
		return expLaboral;
	}

	public void setExpLaboral(String expLaboral) {
		this.expLaboral = expLaboral;
	}

	public String getConInf() {
		return conInf;
	}

	public void setConInf(String conInf) {
		this.conInf = conInf;
	}

	public String getInfCompl() {
		return infCompl;
	}

	public void setInfCompl(String infCompl) {
		this.infCompl = infCompl;
	}

	public String getDatosAdi() {
		return datosAdi;
	}

	public void setDatosAdi(String datosAdi) {
		this.datosAdi = datosAdi;
	}
	
}
