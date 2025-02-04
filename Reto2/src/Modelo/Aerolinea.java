package Modelo;

import java.util.ArrayList;

public class Aerolinea {

	private String codAeroli;
	private String lugarAeroli;;
	
	public Aerolinea() {
		
	}

	public Aerolinea(String codAeroli, String lugarAeroli) {
		this.codAeroli = codAeroli;
		this.lugarAeroli = lugarAeroli;

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



	@Override
	public String toString() {
		return "Aerolinea [codAeroli=" + codAeroli + ", lugarAeroli=" + lugarAeroli + "]";
	}
	
	
	
	
	
	
}
