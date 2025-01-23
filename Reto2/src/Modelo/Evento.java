package Modelo;

public class Evento {

	private String EventoId;
	private String EventoTipo;
	private Viaje viaje;
	
	public String getEventoId() {
		return EventoId;
	}
	public void setEventoId(String eventoId) {
		EventoId = eventoId;
	}
	public String getEventoTipo() {
		return EventoTipo;
	}
	public void setEventoTipo(String eventoTipo) {
		EventoTipo = eventoTipo;
	}
	public Viaje getViaje() {
		return viaje;
	}
	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}
	@Override
	public String toString() {
		return "Evento [EventoId=" + EventoId + ", EventoTipo=" + EventoTipo + ", viaje=" + viaje + "]";
	}
	
	
	
}
