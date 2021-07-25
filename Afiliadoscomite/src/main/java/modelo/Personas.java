package modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personas implements Serializable{

	/*
	 * Entidades para mysql 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpersonas")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido1")
	private String apellido1;
	@Column(name="apellido2")
	private String apellido2;
	@Column(name="email")
	private String email;
	@Column(name="telefono")
	private String telefono;
	@Column(name="dni")
	private String dni;
	@Column(name="cantidad")
	private double cantidad;
	@Column(name="fechaingreso")
	private LocalDate fechaingreso;
	@Column(name="fechabaja")
	private LocalDate fechabaja;
	
	/*
	 * Constructor vacio 
	 */
	public Personas() {
		super();
	}

	/*
	 * Constructor para insertar
	 */
	public Personas(String nombre, String apellido1, String apellido2, String email, String telefono, String dni,
			double cantidad, LocalDate fechaingreso, LocalDate fechabaja) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
		this.telefono = telefono;
		this.dni = dni;
		this.cantidad = cantidad;
		this.fechaingreso = fechaingreso;
		this.fechabaja = fechabaja;
	}

	/*
	 * Constructor para eliminar
	 */
	public Personas(int id) {
		super();
		this.id = id;
	}

	/*
	 * Constructor para select
	 */
	public Personas(int id, String nombre, String apellido1, String apellido2, String email, String telefono,
			String dni, double cantidad, LocalDate fechaingreso, LocalDate fechabaja) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
		this.telefono = telefono;
		this.dni = dni;
		this.cantidad = cantidad;
		this.fechaingreso = fechaingreso;
		this.fechabaja = fechabaja;
	}

	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * @param apellido1 el apellido1 a establecer
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * @return el apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @param apellido2 el apellido2 a establecer
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * @return el email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email el email a establecer
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return el telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return el dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni el dni a establecer
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return el cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad el cantidad a establecer
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return el fechaingreso
	 */
	public LocalDate getFechaingreso() {
		return fechaingreso;
	}

	/**
	 * @param fechaingreso el fechaingreso a establecer
	 */
	public void setFechaingreso(LocalDate fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	/**
	 * @return el fechabaja
	 */
	public LocalDate getFechabaja() {
		return fechabaja;
	}

	/**
	 * @param fechabaja el fechabaja a establecer
	 */
	public void setFechabaja(LocalDate fechabaja) {
		this.fechabaja = fechabaja;
	}

	@Override
	public String toString() {
		return "Personas [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", email=" + email + ", telefono=" + telefono + ", dni=" + dni + ", cantidad=" + cantidad
				+ ", fechaingreso=" + fechaingreso + ", fechabaja=" + fechabaja + "]";
	}
	
	
	
	
	
	
}
