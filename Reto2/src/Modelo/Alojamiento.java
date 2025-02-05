package Modelo;

public class Alojamiento {

	private String NMBHotel;
	private String fecEntrada;
	private String fecSalida;
	private String ciudad;
	private String tipoHab;
	private String eventoId;
	private Viaje viaje;
	private String nombre;
	private String precio;
	
	public Alojamiento() {
		NMBHotel="";
		fecEntrada="";
		fecSalida="";
		ciudad="";
		tipoHab="";
		eventoId="";
		viaje=new Viaje();
		nombre="";
		precio="";
		
	}
	
	public Alojamiento(String NMBHotel, String fecEntrada, String fecSalida, String ciudad, String tipoHab,
			String eventoId, Viaje viaje, String nombre, String precio) {
		this.NMBHotel = NMBHotel;
		this.fecEntrada = fecEntrada;
		this.fecSalida = fecSalida;
		this.ciudad = ciudad;
		this.tipoHab = tipoHab;
		this.eventoId = eventoId;
		this.viaje = viaje;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNMBHotel() {
		return NMBHotel;
	}

	public void setNMBHotel(String nMBHotel) {
		NMBHotel = nMBHotel;
	}

	public String getFecEntrada() {
		return fecEntrada;
	}

	public void setFecEntrada(String fecEntrada) {
		this.fecEntrada = fecEntrada;
	}

	public String getFecSalida() {
		return fecSalida;
	}

	public void setFecSalida(String fecSalida) {
		this.fecSalida = fecSalida;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTipoHab() {
		return tipoHab;
	}

	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
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

	@Override
	public String toString() {
		return "Alojamiento [NMBHotel=" + NMBHotel + ", fecEntrada=" + fecEntrada + ", fecSalida=" + fecSalida
				+ ", ciudad=" + ciudad + ", tipoHab=" + tipoHab + ", eventoId=" + eventoId + ", viaje=" + viaje + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
}
