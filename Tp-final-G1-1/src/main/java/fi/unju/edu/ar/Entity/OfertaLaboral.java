package fi.unju.edu.ar.Entity;

public class OfertaLaboral {
	private int cantidadVacantes;//cantidad de vacantes
	private String puesto;//puesto requerido
	private String resumenPuesto;//resumen del puesto
	private int horas;//disponibilidad horaria
	private String tareas;//tareas principales
	private int contacto;//datos del contacto (telefono)
	private String jornada;
	private String requisitos;
	private double salario;
	private String beneficio; //???
	private boolean disponible;//solo si esta disponible o no esta disponible

	OfertaLaboral(){}

	public OfertaLaboral(int cantidadVacantes, String puesto, String resumenPuesto, int horas, String tareas,
			int contacto, String jornada, String requisitos, double salario, String beneficio, boolean disponible) {
		super();
		this.cantidadVacantes = cantidadVacantes;
		this.puesto = puesto;
		this.resumenPuesto = resumenPuesto;
		this.horas = horas;
		this.tareas = tareas;
		this.contacto = contacto;
		this.jornada = jornada;
		this.requisitos = requisitos;
		this.salario = salario;
		this.beneficio = beneficio;
		this.disponible = disponible;
	}

	public int getCantidadVacantes() {
		return cantidadVacantes;
	}

	public void setCantidadVacantes(int cantidadVacantes) {
		this.cantidadVacantes = cantidadVacantes;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getResumenPuesto() {
		return resumenPuesto;
	}

	public void setResumenPuesto(String resumenPuesto) {
		this.resumenPuesto = resumenPuesto;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	public int getContacto() {
		return contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
