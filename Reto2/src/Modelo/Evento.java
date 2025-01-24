package Modelo;

public class Evento {
 private String Id;
 private String tipo;
 
 	public Evento() {
 		
 	}
 
 	public Evento(String Id, String tipo) {
	this.Id = Id;
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
