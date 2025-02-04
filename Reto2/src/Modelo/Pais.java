package Modelo;

import java.util.ArrayList;

public class Pais {
 
	private String CodPais;
	private String descripcion;
	
	public Pais() {
		
	}
	
	public Pais (String CodPais, String descripcion){
		this.CodPais=CodPais;
		this.descripcion=descripcion;
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
		return "Pais [CodPais=" + CodPais + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
