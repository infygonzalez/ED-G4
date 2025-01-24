package Modelo;

import java.util.ArrayList;

public class Agencias {
	private String agenciaId;
	private String agenciaNombre;
	private String agenciaLogo;
	private String agenciaColorMarca;
	private String agenciaNumEmple;
	private String agenciaTipo;
	private ArrayList<Viaje> viajes;
	
	public Agencias() {
		
	}
	
	public Agencias (String agenciaId, String agenciaNombre, String agenciaLogo, String agenciaColorMarca, String agenciaNumEmple, String agenciaTipo, ArrayList<Viaje> viajes){
		this.agenciaId=agenciaId;
		this.agenciaNombre=agenciaNombre;
		this.agenciaLogo=agenciaLogo;
		this.agenciaColorMarca=agenciaColorMarca;
		this.agenciaNumEmple=agenciaNumEmple;
		this.agenciaTipo=agenciaTipo;
		this.viajes=viajes;

		
	}
	
	
	public ArrayList<Viaje> getViajes() {
		return viajes;
	}
	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}
	public String getAgenciaId() {
		return agenciaId;
	}
	public void setAgenciaId(String agenciaId) {
		this.agenciaId = agenciaId;
	}
	public String getAgenciaNombre() {
		return agenciaNombre;
	}
	public void setAgenciaNombre(String agenciaNombre) {
		this.agenciaNombre = agenciaNombre;
	}
	public String getAgenciaLogo() {
		return agenciaLogo;
	}
	public void setAgenciaLogo(String agenciaLogo) {
		this.agenciaLogo = agenciaLogo;
	}
	public String getAgenciaColorMarca() {
		return agenciaColorMarca;
	}
	public void setAgenciaColorMarca(String agenciaColorMarca) {
		this.agenciaColorMarca = agenciaColorMarca;
	}
	public String getAgenciaNumEmple() {
		return agenciaNumEmple;
	}
	public void setAgenciaNumEmple(String agenciaNumEmple) {
		this.agenciaNumEmple = agenciaNumEmple;
	}
	public String getAgenciaTipo() {
		return agenciaTipo;
	}
	public void setAgenciaTipo(String agenciaTipo) {
		this.agenciaTipo = agenciaTipo;
	}
	@Override
	public String toString() {
		return "Agencias [agenciaId=" + agenciaId + ", agenciaNombre=" + agenciaNombre + ", agenciaLogo=" + agenciaLogo
				+ ", agenciaColorMarca=" + agenciaColorMarca + ", agenciaNumEmple=" + agenciaNumEmple + ", agenciaTipo="
				+ agenciaTipo + ", viajes=" + viajes + "]";
	}
	
	



}
