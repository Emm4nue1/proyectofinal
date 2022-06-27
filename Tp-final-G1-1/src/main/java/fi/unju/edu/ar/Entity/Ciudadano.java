package fi.unju.edu.ar.Entity;

import java.time.LocalDate;

public class Ciudadano {
	
	private int dni;
	private int n_tramite;
	private String email;
	private String e_civil;
	private String provincia;
	private int telefono;
	private LocalDate nacimiento;
    private String password;
	
    public Ciudadano() {}

	public Ciudadano(int dni, int n_tramite, String email, String e_civil, String provincia, int telefono,
			LocalDate nacimiento, String password) {
		super();
		this.dni = dni;
		this.n_tramite = n_tramite;
		this.email = email;
		this.e_civil = e_civil;
		this.provincia = provincia;
		this.telefono = telefono;
		this.nacimiento = nacimiento;
		this.password = password;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getN_tramite() {
		return n_tramite;
	}

	public void setN_tramite(int n_tramite) {
		this.n_tramite = n_tramite;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getE_civil() {
		return e_civil;
	}

	public void setE_civil(String e_civil) {
		this.e_civil = e_civil;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
 
    

}
