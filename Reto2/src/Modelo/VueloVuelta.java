package Modelo;

public class VueloVuelta extends VueloIda{
	private String durViajeVuelta;
	private String fecVuelta;
	private String horaVuelta;
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	private Aerolinea aerolinea2;

	
	
	public VueloVuelta() {
	}
	public VueloVuelta(String codVuelo, String fecSal, String horaSal, String durViaje, String eventoId,
			Viaje viaje, String nombre, String precio, Aeropuerto aeropuertoOrigen,Aeropuerto aeropuertoDestino, Aerolinea aerolinea, String durViajeVuelta, String fecVuelta, String horaVuelta,
			Aeropuerto aeropuerto2, Aerolinea aerolinea2) {
		super(codVuelo, fecSal, horaSal, durViaje, eventoId, viaje, nombre, precio, aeropuertoOrigen, aeropuertoDestino, aerolinea);
		this.durViajeVuelta=durViajeVuelta;
		this.fecVuelta=fecVuelta;
		this.horaVuelta=horaVuelta;
		this.aeropuertoOrigen=aeropuertoOrigen;
		this.aeropuertoDestino=aeropuertoDestino;
		this.aerolinea2=aerolinea2;
		
	}
	public String getDurViajeVuelta() {
		return durViajeVuelta;
	}
	public void setDurViajeVuelta(String durViajeVuelta) {
		this.durViajeVuelta = durViajeVuelta;
	}
	public String getFecVuelta() {
		return fecVuelta;
	}
	public void setFecVuelta(String fecVuelta) {
		this.fecVuelta = fecVuelta;
	}
	public String getHoraVuelta() {
		return horaVuelta;
	}
	public void setHoraVuelta(String horaVuelta) {
		this.horaVuelta = horaVuelta;
	}
	
	public Aerolinea getAerolinea2() {
		return aerolinea2;
	}
	public void setAerolinea2(Aerolinea aerolinea2) {
		this.aerolinea2 = aerolinea2;
	}
	public Aeropuerto getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}
	public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}
	public Aeropuerto getAeropuertoDestino() {
		return aeropuertoDestino;
	}
	public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}
	@Override
	public String toString() {
		return "VueloVuelta [durViajeVuelta=" + durViajeVuelta + ", fecVuelta=" + fecVuelta + ", horaVuelta="
				+ horaVuelta + ", aeropuertoOrigen=" + aeropuertoOrigen + ", aeropuertoDestino=" + aeropuertoDestino
				+ ", aerolinea2=" + aerolinea2 + "]";
	}


	
	

}
