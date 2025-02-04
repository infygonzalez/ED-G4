package Modelo;

import java.util.ArrayList;

public class Aeropuerto{
	private String CodAero;
	private String LugarAero;
	
	public Aeropuerto() {
		
	}
	
	public Aeropuerto(String CodAero, String LugarAero) {
		this.CodAero=CodAero;
		this.LugarAero=LugarAero;
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


	@Override
	public String toString() {
		return "Aeropuerto [CodAero=" + CodAero + ", LugarAero=" + LugarAero + "]";
	}
	


	
}
