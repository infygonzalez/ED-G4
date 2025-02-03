package Modelo;

public class SQLQuerys {
	
	
	//inserts
	public static final String INSERT__AGENCIA = "insert into agencias(Nombre, LogoURL, ColorMarca, NumEmpleados, TipoAgencia,  Contraseña) values('";
	public static final String SEPARATOR = "', '";
	public static final String END_BLOCK = "')";
	
	//selects
	public static final String SELECT_LOGIN= "select * from agencias where Nombre=? and contraseña=?";
	public static final String SELECT_ID_VALIDAR= "select agenciaID from agencias where agenciaID=?"; 
	public static final String SELECT_TODOS_VIAJES="select * from viajes";
	public static final String SELECT_TODOS_PAISES="select * from paises";
	public static final String SELECT_TODOS_ALOJAMIENTOS="select * from Alojamientos";
	public static final String SELECT_TODOS_VUELOS="select * from Vuelos";
	public static final String SELECT_TODOS_OTROS="select * from Actividades";
	
	//delete
	public static final String DELETE_ELIMINAR="delete * from viajes where ViajeID=?";
	
	
	
}
