package Modelo;

public class Alojamiento {
	
	private String NMBHotel;
	private String precio;
	private String fecEntrada;
	private String fecSalida;
	private String ciudad;
	private String tipoHabi;

	
	
	public Alojamiento(String NMBHotel, String precio, String fecEntrada, String fecSalida, String ciudad,
			String tipoHabi) {
		
		super (EventoId);
		
		this.NMBHotel = NMBHotel;
		this.precio = precio;
		this.fecEntrada = fecEntrada;
		this.fecSalida = fecSalida;
		this.ciudad = ciudad;
		this.tipoHabi = tipoHabi;
	}
	
	
	
	public Alojamiento() {
		
		this.NMBHotel = "";
		this.precio = "";
		this.fecEntrada = "";
		this.fecSalida = "";
		this.ciudad = "";
		this.tipoHabi = "";
		
	}


	
}
