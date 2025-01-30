package Modelo;

public class SQLQuerys {

	public static final String INSERT__AGENCIA = "insert into agencias(Nombre, LogoURL, ColorMarca, NumEmpleados, TipoAgencia,  Contraseña) values('";
	public static final String SEPARATOR = "', '";
	public static final String END_BLOCK = "')";
	
	//select
	public static final String SELECT_LOGIN= "select * from agencias where Nombre=? and contraseña=?";
	public static final String SELECT_ID_VALIDAR= "select agenciaID from agencias where agenciaID=?"; 
	
}
