package Controlador;

import java.util.ArrayList;

import Modelo.*;

public class controlador {

	public static void insertarAgencia(Agencias agencia) {
		Gestor gestor = new Gestor();
		gestor.insertarAgencia(agencia);
	}
	public void comprobarAgencia(Agencias agencia) {
		Gestor gestor = new Gestor();
		gestor.insertarAgencia(agencia);
	}
	public ArrayList <Viaje> buscarTodosViajes(ArrayList<Pais> paises){
		ArrayList<Viaje> viaje = null;
		Gestor gestor= new Gestor();
		viaje = gestor.buscarTodosViajes(paises);
		return viaje;
	}
	public ArrayList <Pais> buscarTodosPaises(){
		ArrayList<Pais> pais = null;
		Gestor gestor= new Gestor();
		pais = gestor.buscarTodosPaises();
		return pais;
	}
}
