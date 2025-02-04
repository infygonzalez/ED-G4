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
	public ArrayList <Viaje> buscarTodosViajes(ArrayList<Pais> paises, Agencias agencia){
		ArrayList<Viaje> viaje = null;
		Gestor gestor= new Gestor();
		viaje = gestor.buscarTodosViajes(paises, agencia);
		return viaje;
	}
	public ArrayList <Pais> buscarTodosPaises(){
		ArrayList<Pais> pais = null;
		Gestor gestor= new Gestor();
		pais = gestor.buscarTodosPaises();
		return pais;
	}
	
	public ArrayList <Alojamiento> buscarTodosAlojamientos(Viaje viaje){
		ArrayList<Alojamiento> alojamiento = null;
		Gestor gestor= new Gestor();
		alojamiento = gestor.buscarTodosAlojamientos(viaje);
		return alojamiento;
	}
	public ArrayList <Otros> buscarTodosOtros( Viaje viaje){
		ArrayList<Otros> otro = null;
		Gestor gestor= new Gestor();
		otro = gestor.buscarTodosOtros(viaje);
		return otro;
	}
	public ArrayList <Vuelo> buscarTodosVuelos(Viaje viaje){
		ArrayList<Vuelo> vuelo = null;
		Gestor gestor= new Gestor();
		vuelo = gestor.buscarTodosVuelos(viaje);
		return vuelo;
	}
	 public void eliminarViajeDeAgencia(Agencias agencia) {
	    boolean eliminado = eliminarViaje(agencia);

	    if (eliminado) {
	       System.out.println("El viaje ha sido eliminado exitosamente.");
	       } else {
	          System.out.println("No se pudo eliminar el viaje. Verifique los datos.");
	        }
	    }
	    private boolean eliminarViaje(Agencias agencia) {
	        return new Gestor().eliminarViaje(agencia);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public void eliminarEventoDeViajes(Viaje viaje) {
		    boolean eliminado2 = eliminarEvento(viaje);

		    if (eliminado2) {
		       System.out.println("El evento ha sido eliminado exitosamente.");
		       } else {
		          System.out.println("No se pudo eliminar el evento. Verifique los datos.");
		        }
		    }
		    private boolean eliminarEvento(Viaje viaje) {
		        return new Gestor().eliminarEvento(viaje);
		    }
}

