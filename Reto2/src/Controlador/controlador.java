package Controlador;

import java.util.ArrayList;

import Modelo.*;

public class controlador {
	

	public static void insertarAgencia(Agencias agencia) {
		Gestor gestor = new Gestor();
		gestor.insertarAgencia(agencia);
	}
	public static void insertarViaje(Viaje viaje) {
		Gestor gestor = new Gestor();
		gestor.insertarViaje(viaje);
	}
	public static void insertarAlojamiento(Alojamiento alojamiento) {
		Gestor gestor = new Gestor();
		gestor.insertarAlojamiento(alojamiento);
	}
	public static void insertarOtros(Otros otros) {
		Gestor gestor = new Gestor();
		gestor.insertarOtros(otros);
	}
	public static void insertarVueloIda(Vuelo vuelo) {
		Gestor gestor = new Gestor();
		gestor.insertarVueloIda(vuelo);
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
	public ArrayList <Aerolinea> buscarTodosAerolineas(){
		ArrayList<Aerolinea> aerolinea = null;
		Gestor gestor= new Gestor();
		aerolinea = gestor.buscarTodosAerolineas();
		return aerolinea;
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
	
	public boolean borrarViaje(Viaje viaje) {
        Gestor gestorViajes = new Gestor();
        boolean valido=true;
        
        ArrayList<Vuelo>vuelos= viaje.getVuelo();
        for(int i =0;i<vuelos.size();i++) {
            
            if(valido==true) {
                valido=eliminarVuelo(vuelos.get(i));
            }
            
        }
        ArrayList<Alojamiento>alojamientos= viaje.getAlojamiento();
        for(int i =0;i<alojamientos.size();i++) {
            
            if(valido==true) {
                valido=eliminarAlojamiento(alojamientos.get(i));
            }
            
        }
        ArrayList<Otros>otros= viaje.getOtros();
        for(int i =0;i<otros.size();i++) {
            
            if(valido==true) {
                valido=eliminarOtros(otros.get(i));
            }
            
        }
        if(valido==true) {
            valido=gestorViajes.eliminarViaje(viaje);
        }
        return valido;
    }
	
	 /*public void eliminarViajeDeAgencia(Viaje viaje) {
	    boolean eliminado = eliminarViaje(viaje);

	    if (eliminado) {
	       System.out.println("El viaje ha sido eliminado exitosamente.");
	       } else {
	          System.out.println("No se pudo eliminar el viaje. Verifique los datos.");
	        }
	    }
	    private boolean eliminarViaje(Viaje viaje) {
	        return new Gestor().eliminarViaje(viaje);
	    }
	    */
	    
	    public void eliminarEventoVuelo(Vuelo vuelo) {
		    boolean eliminado = eliminarVuelo(vuelo);

		    if (eliminado) {
		       System.out.println("El vuelo ha sido eliminado exitosamente.");
		       } else {
		          System.out.println("No se pudo eliminar el vuelo. Verifique los datos.");
		        }
		    }

	    
		    public boolean eliminarVuelo(Vuelo vuelo) {
		        return new Gestor().eliminarVuelo(vuelo);
		    }
		    
		    
		    
	    
		  public void eliminarEventoAlojamiento(Alojamiento alojamiento) {
			    boolean eliminado = eliminarAlojamiento(alojamiento);

			    if (eliminado) {
			       System.out.println("El vuelo ha sido eliminado exitosamente.");
			       } else {
			          System.out.println("No se pudo eliminar el vuelo. Verifique los datos.");
			        }
			    }
			    public boolean eliminarAlojamiento(Alojamiento alojamiento) {
			        return new Gestor().eliminarAlojamiento(alojamiento);
			    }
		    
	    
			    
		  public void eliminarEventoOtros(Otros otros) {
				    boolean eliminado = eliminarOtros(otros);

				    if (eliminado) {
				       System.out.println("El vuelo ha sido eliminado exitosamente.");
				       } else {
				          System.out.println("No se pudo eliminar el vuelo. Verifique los datos.");
				        }
				    }
				    public boolean eliminarOtros(Otros otros) {
				        return new Gestor().eliminarOtros(otros);
				    }
			    
	    
	    
	    
}

