package Modelo;

public class Evento {
 private String Id;
 private String tipo;
 
 	public Evento(String id, String tipo) {
	Id = id;
	this.tipo = tipo;
 	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Evento [Id=" + Id + ", tipo=" + tipo + "]";
	}
 	
 	
 
}
