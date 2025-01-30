package Modelo;
import java.util.ArrayList;

import Modelo.Agencias;

public class Viaje {
	private String viajesId;
	private String viajesNombre;
	private String viajesDescripcion;
	private String viajesFechas;
	private String viajesTipo;
	private String viajesDescServNo;
	private String viajesDuracion;
	private Agencias agencia;
	private Pais pais;
	
	
	public Viaje() {
	
	}

	public Viaje (String viajesId, String viajesNombre, String viajesDescripcion, String viajesFechas, String viajesTipo, String viajesDescServNo,String viajesDuracion,Agencias agencia, Pais pais){
		this.viajesId=viajesId;
		this.viajesNombre=viajesNombre;
		this.viajesDescripcion=viajesDescripcion;
		this.viajesFechas=viajesFechas;
		this.viajesTipo=viajesTipo;
		this.viajesDescServNo=viajesDescServNo;
		this.viajesDuracion=viajesDuracion;
		this.agencia=agencia;
		this.pais=pais;

		
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
	public String getViajesFechas() {
		return viajesFechas;
	}
	public void setViajesFechas(String viajesFechas) {
		this.viajesFechas = viajesFechas;
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

	@Override
	public String toString() {
		return "Viaje [viajesId=" + viajesId + ", viajesNombre=" + viajesNombre + ", viajesDescripcion="
				+ viajesDescripcion + ", viajesFechas=" + viajesFechas + ", viajesTipo=" + viajesTipo
				+ ", viajesDescServNo=" + viajesDescServNo + ", viajesDuracion=" + viajesDuracion + ", agencia="
				+ agencia + ", pais=" + pais + "]";
	}
	

	

	

}
