package Modelo;

import java.util.ArrayList;

public class Aerolinea {

	private String codAeroli;
	private String lugarAeroli;
	private ArrayList<Vuelo> vuelo;
	
	public Aerolinea() {
		
	}

	public Aerolinea(String codAeroli, String lugarAeroli, ArrayList<Vuelo> vuelo) {
		this.codAeroli = codAeroli;
		this.lugarAeroli = lugarAeroli;
		this.vuelo = vuelo;
	}

	public String getCodAeroli() {
		return codAeroli;
	}

	public void setCodAeroli(String codAeroli) {
		this.codAeroli = codAeroli;
	}

	public String getLugarAeroli() {
		return lugarAeroli;
	}

	public void setLugarAeroli(String lugarAeroli) {
		this.lugarAeroli = lugarAeroli;
	}

	public ArrayList<Vuelo> getVueloIda() {
		return vuelo;
	}

	public void setVueloIda(ArrayList<Vuelo> vueloIda) {
		this.vuelo = vueloIda;
	}

	@Override
	public String toString() {
		return "Aerolinea [codAeroli=" + codAeroli + ", lugarAeroli=" + lugarAeroli + ", vuelo=" + vuelo + "]";
	}
	
	
	
	
	
	
}
