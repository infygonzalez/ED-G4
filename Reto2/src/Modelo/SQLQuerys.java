package Modelo;

public class SQLQuerys {
	
	
	//inserts
	public static final String INSERT__AGENCIA = "insert into agencias(Nombre, ColorMarca, LogoURL, NumEmpleados, TipoAgencia,  Contraseña) values('";
	public static final String INSERT_VIAJE = "insert into viajes(AgenciaID, PaisID, Nombre, Descripcion,  TipoViaje, FechaInicio, FechaFin, ServiciosNoIncluidos) values('";
	public static final String INSERT_ALOJAMIENTO = "insert into Alojamientos(ViajeID, NombreEvento, NombreHotel, Ciudad,  TipoHabitacion, FechaEntrada, FechaSalida, Precio) values('";
	public static final String INSERT_OTROS = "insert into Actividades(ViajeID, NombreEvento, Descripcion, Fecha, Precio) values('";
	public static final String INSERT_VUELO_IDA = "insert into Vuelos(ViajeID, NombreEvento, AeropuertoOrigen, AeropuertoDestino, CodigoVuelo, CodigoAerolinea, FechaSalida, HoraSalida, Duracion, Precio) values('";
	public static final String INSERT_VUELO_IDAVUELTA = "insert into Vuelos(ViajeID, NombreEvento, AeropuertoOrigen, AeropuertoDestino, CodigoVuelo, CodigoAerolinea, FechaSalida, HoraSalida, Duracion, Precio, FechaRegreso, HoraRegreso, DuracionRegreso, PrecioTotal, CodigoVueloVuelta, CodigoAerolineaRegreso, AeropuertoOrigenVuelta, AeropuertoDestinoVuelta) values('";

	public static final String SEPARATOR = "', '";
	public static final String END_BLOCK = "')";
	
	//selects
	public static final String SELECT_LOGIN= "select * from agencias where Nombre=? and contraseña=?";
	public static final String SELECT_ID_VALIDAR= "select agenciaID from agencias where agenciaID=?"; 
	public static final String SELECT_TODOS_VIAJES="select * from viajes where AgenciaID = ?";
	public static final String SELECT_TODOS_PAISES="select * from paises";
	public static final String SELECT_TODOS_AEROPUERTO="select * from Aeropuerto";
	public static final String SELECT_TODOS_AEROLINEAS="select * from Aerolinea";
	public static final String SELECT_TODOS_ALOJAMIENTOS="select * from Alojamientos where ViajeID = ?";
	public static final String SELECT_TODOS_VUELOS="select * from Vuelos where ViajeID = ?";
	public static final String SELECT_TODOS_OTROS="select * from Actividades where ViajeID = ?";
	public static final String SELECT_NOMBRE_AGENCIA="select * from Agencias where AgenciaID = ?";

	
	//delete
	public static final String DELETE_ELIMINAR_VIAJE="delete from viajes where ViajeID=?";
	public static final String DELETE_ELIMINAR_VUELO="delete from Vuelos where VueloID=?";
	public static final String DELETE_ELIMINAR_OTROS="delete from Actividades where ActividadID=?";
	public static final String DELETE_ELIMINAR_ALOJAMIENTO="delete from Alojamientos where AlojamientoID=?";
	
	
}
