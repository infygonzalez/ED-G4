package Modelo;

import java.util.ArrayList;

public class Aerolinea {

	private String codAeroli;
	private String lugarAeroli;
	private ArrayList<VueloIda> vueloIda;
	
	public Aerolinea() {
		
	}

	public Aerolinea(String codAeroli, String lugarAeroli, ArrayList<VueloIda> vueloIda) {
		this.codAeroli = codAeroli;
		this.lugarAeroli = lugarAeroli;
		this.vueloIda = vueloIda;
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

	public ArrayList<VueloIda> getVueloIda() {
		return vueloIda;
	}

	public void setVueloIda(ArrayList<VueloIda> vueloIda) {
		this.vueloIda = vueloIda;
	}

	@Override
	public String toString() {
		return "Aerolinea [codAeroli=" + codAeroli + ", lugarAeroli=" + lugarAeroli + ", vueloIda=" + vueloIda + "]";
	}
	
	
	
	
	
	
}
