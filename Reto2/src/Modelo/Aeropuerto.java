package Modelo;

import java.util.ArrayList;

public class Aeropuerto{
	private String CodAero;
	private String LugarAero;
	private ArrayList<Vuelo> vuelo;
	
	public Aeropuerto() {
		
	}
	
	public Aeropuerto(String CodAero, String LugarAero, ArrayList<Vuelo> vuelo) {
		this.CodAero=CodAero;
		this.LugarAero=LugarAero;
		this.vuelo=vuelo;
	}

	public String getCodAero() {
		return CodAero;
	}

	public void setCodAero(String codAero) {
		CodAero = codAero;
	}

	public String getLugarAero() {
		return LugarAero;
	}

	public void setLugarAero(String lugarAero) {
		LugarAero = lugarAero;
	}

	public ArrayList<Vuelo> getVueloIda() {
		return vuelo;
	}

	public void setVueloIda(ArrayList<Vuelo> vueloIda) {
		this.vuelo = vueloIda;
	}

	@Override
	public String toString() {
		return "Aeropuerto [CodAero=" + CodAero + ", LugarAero=" + LugarAero + ", vuelo=" + vuelo + "]";
	}
	


	
}
