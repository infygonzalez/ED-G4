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
	
	public ArrayList <Alojamiento> buscarTodosAlojamientos(){
		ArrayList<Alojamiento> alojamiento = null;
		Gestor gestor= new Gestor();
		alojamiento = gestor.buscarTodosAlojamientos();
		return alojamiento;
	}
	public ArrayList <Otros> buscarTodosOtros(){
		ArrayList<Otros> otro = null;
		Gestor gestor= new Gestor();
		otro = gestor.buscarTodosOtros();
		return otro;
	}
	public ArrayList <Vuelo> buscarTodosVuelos(){
		ArrayList<Vuelo> vuelo = null;
		Gestor gestor= new Gestor();
		vuelo = gestor.buscarTodosVuelos();
		return vuelo;
	}
	public Viaje buscarViajePorNombre(String nombre) {
        // Aquí creas una instancia de Gestor y obtienes todos los viajes
        ArrayList<Viaje> viajes = Gestor.buscarTodosViajes(); // Obtengo todos los viajes
        for (Viaje viaje : viajes) {
            if (viaje.getViajesNombre().equalsIgnoreCase(nombre)) {
                return viaje; // Devuelvo el viaje si el nombre coincide
            }
        }
        return null; // Si no se encuentra el viaje, devuelvo null
    }

	
}

