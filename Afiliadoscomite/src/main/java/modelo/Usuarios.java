package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuarios implements Serializable{

	/*
	 * Entidades para mysql 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuarios")
	private int id;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="password")
	private String password;
	
	@Column(name="privilegio")
	private String privilegio;
	
	
	/*
	 * constructor vacio
	 */
	public Usuarios() {
		super();
	}


	/*
	 * 
	 * Constructor para insertar
	 * 
	 */
	public Usuarios(String usuario, String password, String privilegio) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.privilegio = privilegio;
	}


	/*
	 * Constructor para eliminar
	 */
	public Usuarios(int id) {
		super();
		this.id = id;
	}


	/**
	 * @param id
	 * @param usuario
	 * @param password
	 * @param privilegio
	 */
	/*
	 * Constructor para select
	 */
	public Usuarios(int id, String usuario, String password, String privilegio) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.privilegio = privilegio;
	}


	/**
	 * @return  el id
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
	 * @return el usuario
	 */
	public String getUsuario() {
		return usuario;
	}


	/**
	 * @param usuario el usuario a establecer
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	/**
	 * @return el password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password el password a establecer
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return el privilegio
	 */
	public String getPrivilegio() {
		return privilegio;
	}


	/**
	 * @param privilegio el privilegio a establecer
	 */
	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}


	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", usuario=" + usuario + ", password=" + password + ", privilegio=" + privilegio
				+ "]";
	}
	
	
	
	
}
