package Controlador;

import Modelo.Agencias;
import Modelo.Gestor;

public class controlador {

	public void insertarAgencia(Agencias agencia) {
		Gestor gestor = new Gestor();
		gestor.insertarAgencia(agencia);
	}
}
