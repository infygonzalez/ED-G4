package Controlador;

import Modelo.Agencias;
import Modelo.Gestor;

public class controlador {

	public static void insertarAgencia(Agencias agencia) {
		Gestor gestor = new Gestor();
		gestor.insertarAgencia(agencia);
	}
	public void comprobarAgencia(Agencias agencia) {
		Gestor gestor = new Gestor();
		gestor.insertarAgencia(agencia);
	}
}
