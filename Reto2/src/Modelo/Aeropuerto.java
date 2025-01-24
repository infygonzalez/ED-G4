package Modelo;

import java.util.ArrayList;

public class Aeropuerto{
	private String CodAero;
	private String LugarAero;
	private ArrayList<VueloIda> vueloIda;
	
	public Aeropuerto() {
		
	}
	
	public Aeropuerto(String CodAero, String LugarAero, ArrayList<VueloIda> vueloIda) {
		this.CodAero=CodAero;
		this.LugarAero=LugarAero;
		this.vueloIda=vueloIda;
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

	public ArrayList<VueloIda> getVueloIda() {
		return vueloIda;
	}

	public void setVueloIda(ArrayList<VueloIda> vueloIda) {
		this.vueloIda = vueloIda;
	}

	@Override
	public String toString() {
		return "Aeropuerto [CodAero=" + CodAero + ", LugarAero=" + LugarAero + ", vueloIda=" + vueloIda + "]";
	}
	


	
}
