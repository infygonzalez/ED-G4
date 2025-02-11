package Modelo;

public class Otros {
    
    
    private String fecha;
    private String descripcion;
    private String eventoId;
    private Viaje viaje;
    private String precio;
    private String nombre;
    private int viajeId;
    
    public Otros() {
        
    }

    public Otros(String fecha, String descripcion, String eventoId,
            Viaje viaje, String precio, String nombre, int viajeId) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.eventoId = eventoId;
        this.viaje = viaje;
        this.precio = precio;
        this.nombre = nombre;
        this.viajeId=viajeId;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

	public int getViajeId() {
		return viajeId;
	}

	public void setViajeId(int viajeId) {
		this.viajeId = viajeId;
	}

	@Override
	public String toString() {
		return "Otros [fecha=" + fecha + ", descripcion=" + descripcion + ", eventoId=" + eventoId + ", viaje=" + viaje
				+ ", precio=" + precio + ", nombre=" + nombre + ", viajeId=" + viajeId + "]";
	}

	

   
    

}