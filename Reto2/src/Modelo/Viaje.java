package Modelo;
import java.util.ArrayList;

import Modelo.Agencias;

public class Viaje {
	private String viajesId;
	private int AgenciaId;
	private String PaisId;
	private String viajesNombre;
	private String viajesDescripcion;
	private String viajesFechaInicio;
	private String viajesFechaFin;
	private String viajesTipo;
	private String viajesDescServNo;
	private String viajesDuracion;
	private Agencias agencia;
	private Pais pais;
	private ArrayList<Alojamiento> alojamiento;
	private ArrayList<Vuelo> vuelo;
	private ArrayList<Otros> otros;

	
	public Viaje() {
		viajesId="";
		AgenciaId=0;
		PaisId="";
		viajesNombre="";
		viajesDescripcion="";
		viajesFechaInicio="";
		viajesFechaFin="";
		viajesTipo="";
		viajesDescServNo="";
		viajesDuracion="";
		agencia=new Agencias();
		pais= new Pais();
		ArrayList<Alojamiento> alojamiento=new  ArrayList<Alojamiento>();
		ArrayList<Vuelo> vuelo= new ArrayList<Vuelo>();
		ArrayList<Otros> otros= new ArrayList<Otros>();
	}

	public Viaje (String viajesId, int AgenciaId, String PaisId, String viajesNombre, String viajesDescripcion, String viajesFechaInicio,String viajesFechaFin, 
			String viajesTipo, String viajesDescServNo,String viajesDuracion,Agencias agencia, Pais pais, 
			 ArrayList<Alojamiento> alojamiento, ArrayList<Vuelo> vuelo, ArrayList<Otros> otros){
		this.viajesId=viajesId;
		this.AgenciaId=AgenciaId;
		this.PaisId=PaisId;
		this.viajesNombre=viajesNombre;
		this.viajesDescripcion=viajesDescripcion;
		this.viajesFechaInicio=viajesFechaInicio;
		this.viajesFechaFin=viajesFechaFin;
		this.viajesTipo=viajesTipo;
		this.viajesDescServNo=viajesDescServNo;
		this.viajesDuracion=viajesDuracion;
		this.agencia=agencia;
		this.pais=pais;
		this.alojamiento=alojamiento;
		this.vuelo=vuelo;
		this.otros=otros;

		
	}

	public String getViajesId() {
		return viajesId;
	}

	public void setViajesId(String viajesId) {
		this.viajesId = viajesId;
	}

	public String getViajesNombre() {
		return viajesNombre;
	}

	public void setViajesNombre(String viajesNombre) {
		this.viajesNombre = viajesNombre;
	}

	public String getViajesDescripcion() {
		return viajesDescripcion;
	}

	public void setViajesDescripcion(String viajesDescripcion) {
		this.viajesDescripcion = viajesDescripcion;
	}

	public String getViajesFechaInicio() {
		return viajesFechaInicio;
	}

	public void setViajesFechaInicio(String viajesFechaInicio) {
		this.viajesFechaInicio = viajesFechaInicio;
	}

	public String getViajesFechaFin() {
		return viajesFechaFin;
	}

	public void setViajesFechaFin(String viajesFechaFin) {
		this.viajesFechaFin = viajesFechaFin;
	}

	public String getViajesTipo() {
		return viajesTipo;
	}

	public void setViajesTipo(String viajesTipo) {
		this.viajesTipo = viajesTipo;
	}

	public String getViajesDescServNo() {
		return viajesDescServNo;
	}

	public void setViajesDescServNo(String viajesDescServNo) {
		this.viajesDescServNo = viajesDescServNo;
	}

	public String getViajesDuracion() {
		return viajesDuracion;
	}

	public void setViajesDuracion(String viajesDuracion) {
		this.viajesDuracion = viajesDuracion;
	}

	public Agencias getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencias agencia) {
		this.agencia = agencia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public ArrayList<Alojamiento> getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(ArrayList<Alojamiento> alojamiento) {
		this.alojamiento = alojamiento;
	}

	public ArrayList<Vuelo> getVuelo() {
		return vuelo;
	}

	public void setVuelo(ArrayList<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}

	public ArrayList<Otros> getOtros() {
		return otros;
	}

	public void setOtros(ArrayList<Otros> otros) {
		this.otros = otros;
	}

	
	public int getAgenciaId() {
		return AgenciaId;
	}

	public void setAgenciaId(int agenciaId) {
		AgenciaId = agenciaId;
	}

	public String getPaisId() {
		return PaisId;
	}

	public void setPaisId(String paisId) {
		PaisId = paisId;
	}

	@Override
	public String toString() {
		return "Viaje [viajesId=" + viajesId + ", AgenciaId=" + AgenciaId + ", PaisId=" + PaisId + ", viajesNombre="
				+ viajesNombre + ", viajesDescripcion=" + viajesDescripcion + ", viajesFechaInicio=" + viajesFechaInicio
				+ ", viajesFechaFin=" + viajesFechaFin + ", viajesTipo=" + viajesTipo + ", viajesDescServNo="
				+ viajesDescServNo + ", viajesDuracion=" + viajesDuracion + ", agencia=" + agencia + ", pais=" + pais
				+ ", alojamiento=" + alojamiento + ", vuelo=" + vuelo + ", otros=" + otros + "]";
	}

	
	

	

	

}
