package testModelo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import modelo.Usuarios;

public class TestUsuarioLogin {

	ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();
	Usuarios user = new Usuarios("Albert", "123456", "administrador");
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInsert() {
		ListaUsuarios.add(user);
		assertEquals(ListaUsuarios.size(), 1); // verificamos que hay 1 elemento en la lista
	}

	@Test
	public void testRemove() {
		ListaUsuarios.remove(user);
		assertEquals(ListaUsuarios.size(), 0); // verificamos que hay 1 elemento en la lista
	}

	@Test
	public void testUpdate() {

		System.out.println("------------user--------------");
		System.out.println(user.toString());
		System.out.println("----------------------------");
		ListaUsuarios.add(user);
		user.setUsuario("Pinguino");
		System.out.println("---------user UPDATE----------");
		System.out.println(ListaUsuarios.toString());
		System.out.println("----------------------------");
		assertEquals(user, ListaUsuarios.get(0)); // verificamos que se ha actualizado de la lista

	}
}
