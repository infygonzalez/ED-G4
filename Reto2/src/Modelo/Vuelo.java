package Modelo;

public class Vuelo {

	private String CodVuelo;
	private String fecSal;
	private String horaSal;
	private String durViaje;
	private String eventoId;
	private String CodAeroli;
	private Viaje viaje;
	private String nombre;
	private String precio;
	private String aeropuertoOrigen;
	private String aeropuertoDestino;
	private Aerolinea aerolinea;
	private Vuelo vueloVuelta;
	private String tipo;
	private int viajeId;
	
	public Vuelo() {

	}

	public Vuelo(String codVuelo, String fecSal, String horaSal, String durViaje, String eventoId,
			Viaje viaje, String nombre, String precio, String aeropuertoOrigen,String aeropuertoDestino, Aerolinea aerolinea, Vuelo vueloVuelta, String tipo, int viajeId, String CodAeroli) {
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
		this.viajeId=viajeId;
		this.CodAeroli=CodAeroli;
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

	public String getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(String aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public String getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
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

	
	public int getViajeId() {
		return viajeId;
	}

	public void setViajeId(int viajeId) {
		this.viajeId = viajeId;
	}

	
	public String getCodAeroli() {
		return CodAeroli;
	}

	public void setCodAeroli(String codAeroli) {
		CodAeroli = codAeroli;
	}

	@Override
	public String toString() {
		return "Vuelo [CodVuelo=" + CodVuelo + ", fecSal=" + fecSal + ", horaSal=" + horaSal + ", durViaje=" + durViaje
				+ ", eventoId=" + eventoId + ", CodAeroli=" + CodAeroli + ", viaje=" + viaje + ", nombre=" + nombre
				+ ", precio=" + precio + ", aeropuertoOrigen=" + aeropuertoOrigen + ", aeropuertoDestino="
				+ aeropuertoDestino + ", aerolinea=" + aerolinea + ", vueloVuelta=" + vueloVuelta + ", tipo=" + tipo
				+ ", viajeId=" + viajeId + "]";
	}

	

	

	
	


	
}
