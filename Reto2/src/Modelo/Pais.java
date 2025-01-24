package Modelo;

import java.util.ArrayList;

public class Pais {
 
	private String CodPais;
	private String descripcion;
	private ArrayList<Viaje> viajes;
	
	public Pais() {
		
	}
	
	public Pais (String CodPais, String descripcion, ArrayList<Viaje> viajes){
		this.CodPais=CodPais;
		this.descripcion=descripcion;
		this.viajes=viajes;
	}
	
	public ArrayList<Viaje> getViaje() {
		return viajes;
	}
	public void setViaje(ArrayList<Viaje> viaje) {
		this.viajes = viaje;
	}
	public String getCodPais() {
		return CodPais;
	}
	public void setCodPais(String codPais) {
		CodPais = codPais;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Pais [CodPais=" + CodPais + ", descripcion=" + descripcion + ", viajes=" + viajes + "]";
	}
	
	
	
}
