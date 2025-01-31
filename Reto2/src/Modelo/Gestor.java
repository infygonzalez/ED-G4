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
}
