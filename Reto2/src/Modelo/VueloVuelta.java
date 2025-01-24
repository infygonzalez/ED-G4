package Modelo;

public class VueloVuelta extends VueloIda{
	private String durViajeVuelta;
	private String fecVuelta;
	private String horaVuelta;
	private Aeropuerto aeropuerto2;
	private Aerolinea aerolinea2;

	
	
	public VueloVuelta() {
	}
	public VueloVuelta(String codVuelo, String fecSal, String horaSal, String durViaje, String eventoId,
			Viaje viaje, String nombre, String precio, Aeropuerto aeropuerto, Aerolinea aerolinea, String durViajeVuelta, String fecVuelta, String horaVuelta,
			Aeropuerto aeropuerto2, Aerolinea aerolinea2) {
		super(codVuelo, fecSal, horaSal, durViaje, eventoId, viaje, nombre, precio, aeropuerto, aerolinea);
		this.durViajeVuelta=durViajeVuelta;
		this.fecVuelta=fecVuelta;
		this.horaVuelta=horaVuelta;
		this.aeropuerto2=aeropuerto2;
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
	public Aeropuerto getAeropuerto2() {
		return aeropuerto2;
	}
	public void setAeropuerto2(Aeropuerto aeropuerto2) {
		this.aeropuerto2 = aeropuerto2;
	}
	public Aerolinea getAerolinea2() {
		return aerolinea2;
	}
	public void setAerolinea2(Aerolinea aerolinea2) {
		this.aerolinea2 = aerolinea2;
	}
	@Override
	public String toString() {
		return "VueloVuelta [durViajeVuelta=" + durViajeVuelta + ", fecVuelta=" + fecVuelta + ", horaVuelta="
				+ horaVuelta + ", aeropuerto2=" + aeropuerto2 + ", aerolinea2=" + aerolinea2 + "]";
	}

	
	

}
