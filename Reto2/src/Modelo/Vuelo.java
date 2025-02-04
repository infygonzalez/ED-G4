package Modelo;

public class Vuelo {

	private String CodVuelo;
	private String fecSal;
	private String horaSal;
	private String durViaje;
	private String eventoId;
	private Viaje viaje;
	private String nombre;
	private String precio;
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	private Aerolinea aerolinea;
	private Vuelo vueloVuelta;
	private String tipo;
	
	public Vuelo() {

	}

	public Vuelo(String codVuelo, String fecSal, String horaSal, String durViaje, String eventoId,
			Viaje viaje, String nombre, String precio, Aeropuerto aeropuertoOrigen,Aeropuerto aeropuertoDestino, Aerolinea aerolinea, Vuelo vueloVuelta, String tipo) {
		this.CodVuelo = codVuelo;
		this.fecSal = fecSal;
		this.horaSal = horaSal;
		this.durViaje = durViaje;
		this.eventoId = eventoId;
		this.viaje = viaje;
		this.nombre = nombre;
		this.precio = precio;
		this.aeropuertoOrigen=aeropuertoOrigen;
		this.aeropuertoDestino=aeropuertoDestino;
		this.aerolinea=aerolinea;
		this.vueloVuelta=vueloVuelta;
		this.tipo=tipo;
	}

	public String getCodVuelo() {
		return CodVuelo;
	}

	public void setCodVuelo(String codVuelo) {
		CodVuelo = codVuelo;
	}

	public String getFecSal() {
		return fecSal;
	}

	public void setFecSal(String fecSal) {
		this.fecSal = fecSal;
	}

	public String getHoraSal() {
		return horaSal;
	}

	public void setHoraSal(String horaSal) {
		this.horaSal = horaSal;
	}

	public String getDurViaje() {
		return durViaje;
	}

	public void setDurViaje(String durViaje) {
		this.durViaje = durViaje;
	}

	public String getEventoId() {
		return eventoId;
	}

	public void setEventoId(String eventoId) {
		this.eventoId = eventoId;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
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

	public Vuelo getVueloVuelta() {
		return vueloVuelta;
	}

	public void setVueloVuelta(Vuelo vueloVuelta) {
		this.vueloVuelta = vueloVuelta;
	}

	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vuelo [CodVuelo=" + CodVuelo + ", fecSal=" + fecSal + ", horaSal=" + horaSal + ", durViaje=" + durViaje
				+ ", eventoId=" + eventoId + ", viaje=" + viaje + ", nombre=" + nombre + ", precio=" + precio
				+ ", aeropuertoOrigen=" + aeropuertoOrigen + ", aeropuertoDestino=" + aeropuertoDestino + ", aerolinea="
				+ aerolinea + ", vueloVuelta=" + vueloVuelta + ", tipo=" + tipo + "]";
	}

	
	


	
}
