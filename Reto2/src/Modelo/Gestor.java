package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.*;



public class Gestor {

	
		public boolean comprobarAgencia (Agencias agencia) {
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet rs = null;
			
	
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				
				String sql = SQLQuerys.SELECT_LOGIN;
				sentencia=conexion.prepareStatement(sql);
				sentencia.setString(1,agencia.getAgenciaNombre());
				sentencia.setString(2,agencia.getContraseña());
				rs=sentencia.executeQuery();
				
				return rs.next();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}		
			}

		public void insertarAgencia (Agencias agencia) {
			Connection conexion =null;
			Statement sentencia=null;
			
			try{
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				sentencia=conexion.createStatement();
				String sql = SQLQuerys.INSERT__AGENCIA + agencia.getAgenciaNombre() + SQLQuerys.SEPARATOR + 
						 agencia.getAgenciaColorMarca() + SQLQuerys.SEPARATOR + 
						agencia.getAgenciaLogo() + SQLQuerys.SEPARATOR + 
						 agencia.getAgenciaNumEmple() + SQLQuerys.SEPARATOR + 
						 agencia.getAgenciaTipo() + SQLQuerys.SEPARATOR + 
						agencia.getContraseña() + SQLQuerys.END_BLOCK;
				sentencia.executeUpdate(sql);
				
				
			}catch(SQLException sqle) {
				
				System.out.println("Error con la base de datos "+ sqle.getMessage());
			}catch(Exception e) {
				System.out.println("Error generico"+ e.getMessage());
			}
			
			try {
				sentencia.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar la sentencia");
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar la conexion");
			}
		
	}
		
		public ArrayList<Pais> buscarTodosPaises(){
				Connection conexion =null;
				PreparedStatement sentencia=null;
				ResultSet resultset = null;
				ArrayList<Pais> paises = null;				
				try {
					Class.forName(DButils.DRIVER);
					conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
					String sql = SQLQuerys.SELECT_TODOS_PAISES;
					sentencia=conexion.prepareStatement(sql);
					resultset = sentencia.executeQuery();
					paises = new ArrayList<Pais>();
					while (resultset.next()) {
						Pais pais =new Pais();
						pais.setCodPais(resultset.getString("PaisID"));
						pais.setDescripcion(resultset.getString("Nombre"));
						paises.add(pais);
					}
					
					
				
				}catch (SQLException sqle) {
					System.out.println("error con la base de datos " + sqle.getMessage());
				}catch(Exception e) {
					System.out.println("Error generico "+ e.getMessage());
				}try {
					resultset.close();
				}catch (SQLException e) {
					System.out.println("Error al cerrar resulset ");
				}try {
					sentencia.close();
				}catch (SQLException e) {
					System.out.println("Error al cerrar sentencia ");
				}try {
					conexion.close();
				}catch (SQLException e) {
					System.out.println("Error al cerrar conexion ");
				}
				
				return paises;
				
			}
		
		public ArrayList<Viaje> buscarTodosViajes(ArrayList<Pais> paises){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Viaje> viajes = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_VIAJES;
				sentencia=conexion.prepareStatement(sql);
				resultset = sentencia.executeQuery();
				viajes = new ArrayList<Viaje>();
				while (resultset.next()) {
					Viaje viaje =new Viaje();
					viaje.setViajesNombre(resultset.getString("Nombre"));
					viaje.setViajesTipo(resultset.getString("TipoViaje"));
					viaje.setViajesDuracion(resultset.getString("DuracionDias"));
					viaje.setViajesFechaInicio(resultset.getString("fechaInicio"));
					viaje.setViajesFechaFin(resultset.getString("fechaFin"));
					for(Pais pais:paises) {
						if(pais.getCodPais().equals(resultset.getString("PaisID"))) {
							viaje.setPais(pais);

						}
					}
					viajes.add(viaje);
				}
				
				
			
			}catch (SQLException sqle) {
				System.out.println("error con la base de datos " + sqle.getMessage());
			}catch(Exception e) {
				System.out.println("Error generico "+ e.getMessage());
			}try {
				resultset.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar resulset ");
			}try {
				sentencia.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar sentencia ");
			}try {
				conexion.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar conexion ");
			}
			
			return viajes;
			
		}
		
		public ArrayList<Alojamiento> buscarTodosAlojamientos(){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Alojamiento> alojamientos = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_ALOJAMIENTOS;
				sentencia=conexion.prepareStatement(sql);
				resultset = sentencia.executeQuery();
				alojamientos = new ArrayList<Alojamiento>();
				while (resultset.next()) {
					Alojamiento alojamiento =new Alojamiento();
					alojamiento.setNombre(resultset.getString("NombreEvento"));
					alojamiento.setFecEntrada(resultset.getString("FechaEntrada"));
					alojamiento.setPrecio(resultset.getString("Precio"));
					alojamientos.add(alojamiento);
				}
				
				
			
			}catch (SQLException sqle) {
				System.out.println("error con la base de datos " + sqle.getMessage());
			}catch(Exception e) {
				System.out.println("Error generico "+ e.getMessage());
			}try {
				resultset.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar resulset ");
			}try {
				sentencia.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar sentencia ");
			}try {
				conexion.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar conexion ");
			}
			
			return alojamientos;
			
		}
		public ArrayList<Otros> buscarTodosOtros(){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Otros> otros = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_OTROS;
				sentencia=conexion.prepareStatement(sql);
				resultset = sentencia.executeQuery();
				otros = new ArrayList<Otros>();
				while (resultset.next()) {
					Otros otro =new Otros();
					otro.setNombre(resultset.getString("NombreEvento"));
					otro.setFecha(resultset.getString("Fecha"));
					otro.setPrecio(resultset.getString("Precio"));
					otros.add(otro);
				}
				
				
			
			}catch (SQLException sqle) {
				System.out.println("error con la base de datos " + sqle.getMessage());
			}catch(Exception e) {
				System.out.println("Error generico "+ e.getMessage());
			}try {
				resultset.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar resulset ");
			}try {
				sentencia.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar sentencia ");
			}try {
				conexion.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar conexion ");
			}
			
			return otros;
			
		}
		public ArrayList<Vuelo> buscarTodosVuelos(){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Vuelo> vuelos = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_VUELOS;
				sentencia=conexion.prepareStatement(sql);
				resultset = sentencia.executeQuery();
				vuelos = new ArrayList<Vuelo>();
				while (resultset.next()) {
					Vuelo vuelo =new Vuelo();
					vuelo.setNombre(resultset.getString("NombreEvento"));
					vuelo.setFecSal(resultset.getString("FechaSalida"));
					vuelo.setPrecio(resultset.getString("PrecioTotal"));
					vuelos.add(vuelo);
				}
				
				
			
			}catch (SQLException sqle) {
				System.out.println("error con la base de datos " + sqle.getMessage());
			}catch(Exception e) {
				System.out.println("Error generico "+ e.getMessage());
			}try {
				resultset.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar resulset ");
			}try {
				sentencia.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar sentencia ");
			}try {
				conexion.close();
			}catch (SQLException e) {
				System.out.println("Error al cerrar conexion ");
			}
			
			return vuelos;
			
		}
		public Viaje buscarViajePorNombre(String nombreViaje) {
		    Connection conexion = null;
		    PreparedStatement sentencia = null;
		    ResultSet resultset = null;
		    Viaje viaje = null;

		    try {
		        Class.forName(DButils.DRIVER);
		        conexion = DriverManager.getConnection(DButils.URL, DButils.USER, DButils.CONTRASEÑA);
		        String sql = "SELECT * FROM Viajes WHERE Nombre = ?"; // Asegúrate de tener la consulta correcta
		        sentencia = conexion.prepareStatement(sql);
		        sentencia.setString(1, nombreViaje);
		        resultset = sentencia.executeQuery();

		        if (resultset.next()) {
		            viaje = new Viaje();
		            viaje.setViajesNombre(resultset.getString("Nombre"));
		            viaje.setViajesTipo(resultset.getString("TipoViaje"));
		            viaje.setViajesDuracion(resultset.getString("DuracionDias"));
		            viaje.setViajesFechaInicio(resultset.getString("fechaInicio"));
		            viaje.setViajesFechaFin(resultset.getString("fechaFin"));
		            
		            // Aquí asignamos el Pais relacionado (si tienes la lógica para ello)
		            Pais pais = new Pais();
		            pais.setCodPais(resultset.getString("PaisID"));
		            pais.setDescripcion(resultset.getString("PaisDescripcion"));
		            viaje.setPais(pais);
		        }

		    } catch (SQLException sqle) {
		        System.out.println("Error con la base de datos: " + sqle.getMessage());
		    } catch (Exception e) {
		        System.out.println("Error generico: " + e.getMessage());
		    } finally {
		        try {
		            if (resultset != null) resultset.close();
		            if (sentencia != null) sentencia.close();
		            if (conexion != null) conexion.close();
		        } catch (SQLException e) {
		            System.out.println("Error al cerrar recursos: " + e.getMessage());
		        }
		    }

		    return viaje; // Si no se encuentra, devuelve null
		}
}
