package Modelo;

public class Otros {
	
	
		private String otrosNombre;
		private String fecha;
		private String descripcion;
		private String eventoId;
		private String eventoTipo;
		private Viaje viaje;
		private String precio;
		private String nombre;
		
		public Otros() {
			
		}

		public Otros(String otrosNombre, String fecha, String descripcion, String eventoId, String eventoTipo,
				Viaje viaje, String precio, String nombre) {
			this.otrosNombre = otrosNombre;
			this.fecha = fecha;
			this.descripcion = descripcion;
			this.eventoId = eventoId;
			this.eventoTipo = eventoTipo;
			this.viaje = viaje;
			this.precio = precio;
			this.nombre = nombre;
		}

		public String getOtrosNombre() {
			return otrosNombre;
		}

		public void setOtrosNombre(String otrosNombre) {
			this.otrosNombre = otrosNombre;
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

		public String getEventoTipo() {
			return eventoTipo;
		}

		public void setEventoTipo(String eventoTipo) {
			this.eventoTipo = eventoTipo;
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

		@Override
		public String toString() {
			return "Otros [otrosNombre=" + otrosNombre + ", fecha=" + fecha + ", descripcion=" + descripcion
					+ ", eventoId=" + eventoId + ", eventoTipo=" + eventoTipo + ", viaje=" + viaje + ", precio="
					+ precio + ", nombre=" + nombre + "]";
		}
		

}
