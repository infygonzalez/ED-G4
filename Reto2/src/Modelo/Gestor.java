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

	
		public Agencias comprobarAgencia (Agencias agencia) {
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
				
				if (rs.next()) {
					agencia = new Agencias();
					agencia.setAgenciaId(rs.getString("AgenciaID"));
					agencia.setAgenciaColorMarca(rs.getString("ColorMarca"));
					agencia.setAgenciaNombre(rs.getString("Nombre"));
					agencia.setAgenciaNumEmple(rs.getString("NumEmpleados"));
					agencia.setAgenciaLogo(rs.getString("LogoURL"));
					agencia.setContraseña(rs.getString("Contraseña"));
					agencia.setAgenciaTipo(rs.getString("TipoAgencia"));
					
					return agencia;
					
				}
				return null;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return agencia;
			} catch (SQLException e) {
				e.printStackTrace();
				return agencia;
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
		public void insertarViaje (Viaje viaje) {
			Connection conexion =null;
			Statement sentencia=null;
			
			try{
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				sentencia=conexion.createStatement();
				String sql = SQLQuerys.INSERT_VIAJE + viaje.getAgenciaId() + SQLQuerys.SEPARATOR + viaje.getPaisId() + SQLQuerys.SEPARATOR + viaje.getViajesNombre() + SQLQuerys.SEPARATOR + viaje.getViajesDescripcion() + SQLQuerys.SEPARATOR + viaje.getViajesTipo()
				+ SQLQuerys.SEPARATOR + viaje.getViajesFechaInicio() + SQLQuerys.SEPARATOR + viaje.getViajesFechaFin() + SQLQuerys.SEPARATOR + viaje.getViajesDescServNo() + SQLQuerys.END_BLOCK;
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
		public void insertarAlojamiento (Alojamiento alojamiento) {
			Connection conexion =null;
			Statement sentencia=null;
			
			try{
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				sentencia=conexion.createStatement();
				String sql = SQLQuerys.INSERT_ALOJAMIENTO + alojamiento.getViajeId() + SQLQuerys.SEPARATOR + alojamiento.getNombre() + SQLQuerys.SEPARATOR + alojamiento.getNMBHotel() + SQLQuerys.SEPARATOR + alojamiento.getCiudad() + SQLQuerys.SEPARATOR + alojamiento.getTipoHab()
				+ SQLQuerys.SEPARATOR + alojamiento.getFecEntrada()
				+ SQLQuerys.SEPARATOR + alojamiento.getFecSalida() + SQLQuerys.SEPARATOR + alojamiento.getPrecio() + SQLQuerys.END_BLOCK;
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
		public void insertarOtros(Otros otros) {
			Connection conexion =null;
			Statement sentencia=null;
			
			try{
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				sentencia=conexion.createStatement();
				String sql = SQLQuerys.INSERT_OTROS + otros.getViajeId() + SQLQuerys.SEPARATOR + otros.getNombre() + SQLQuerys.SEPARATOR + otros.getDescripcion() + SQLQuerys.SEPARATOR + otros.getFecha() +
				SQLQuerys.SEPARATOR + otros.getPrecio() + SQLQuerys.END_BLOCK; 
				
				sentencia.executeUpdate(sql);
				
				
			}catch(SQLException sqle) {
				
				System.out.println("Error con la base de datos "+ sqle.getMessage() );
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
		public void insertarVueloIda(Vuelo vuelo) {
			Connection conexion =null;
			Statement sentencia=null;
			
			try{
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				sentencia=conexion.createStatement();
				String sql = SQLQuerys.INSERT_VUELO_IDA + vuelo.getViajeId() + SQLQuerys.SEPARATOR + 
						vuelo.getNombre() + SQLQuerys.SEPARATOR + vuelo.getAeropuertoOrigen()
						+ SQLQuerys.SEPARATOR + vuelo.getAeropuertoDestino() +
						SQLQuerys.SEPARATOR + vuelo.getCodVuelo() + SQLQuerys.SEPARATOR + vuelo.getCodAeroli() + 
						SQLQuerys.SEPARATOR + vuelo.getFecSal() + SQLQuerys.SEPARATOR + vuelo.getHoraSal()  
						+ SQLQuerys.SEPARATOR + vuelo.getDurViaje() + SQLQuerys.SEPARATOR + vuelo.getPrecio() + SQLQuerys.END_BLOCK; 
				
				System.out.println(vuelo.getPrecio());
				
				sentencia.executeUpdate(sql);
				
				
			}catch(SQLException sqle) {
				
				System.out.println("Error con la base de datos "+ sqle.getMessage() );
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
		
		public void insertarVueloIdaVuelta(Vuelo vuelo) {
			Connection conexion =null;
			Statement sentencia=null;
			
			try{
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				sentencia=conexion.createStatement();
				String sql = SQLQuerys.INSERT_VUELO_IDAVUELTA + vuelo.getViajeId() + SQLQuerys.SEPARATOR + 
						vuelo.getNombre() + SQLQuerys.SEPARATOR + vuelo.getAeropuertoOrigen()
						+ SQLQuerys.SEPARATOR + vuelo.getAeropuertoDestino() +
						SQLQuerys.SEPARATOR + vuelo.getCodVuelo() + SQLQuerys.SEPARATOR + vuelo.getCodAeroli() + 
						SQLQuerys.SEPARATOR + vuelo.getFecSal() + SQLQuerys.SEPARATOR + vuelo.getHoraSal()  
						+ SQLQuerys.SEPARATOR + vuelo.getDurViaje() + SQLQuerys.SEPARATOR + vuelo.getPrecio() + SQLQuerys.SEPARATOR +
						vuelo.getFechaRegreso() + SQLQuerys.SEPARATOR + vuelo.getHoraRegreso() + SQLQuerys.SEPARATOR + 
						vuelo.getDuracionRegreso() + SQLQuerys.SEPARATOR + vuelo.getPrecioTotal() + SQLQuerys.SEPARATOR + vuelo.getCodigoVueloVuelta() + SQLQuerys.SEPARATOR + 
						vuelo.getCodAeroliRegreso() + SQLQuerys.SEPARATOR + vuelo.getAeropuertoOrigenVuelta() + SQLQuerys.SEPARATOR + vuelo.getAeropuertoDestinoVuelta() + SQLQuerys.END_BLOCK; 
				
				System.out.println(SQLQuerys.INSERT_VUELO_IDAVUELTA + vuelo.getViajeId() + SQLQuerys.SEPARATOR + 
						vuelo.getNombre() + SQLQuerys.SEPARATOR + vuelo.getAeropuertoOrigen()
						+ SQLQuerys.SEPARATOR + vuelo.getAeropuertoDestino() +
						SQLQuerys.SEPARATOR + vuelo.getCodVuelo() + SQLQuerys.SEPARATOR + vuelo.getCodAeroli() + 
						SQLQuerys.SEPARATOR + vuelo.getFecSal() + SQLQuerys.SEPARATOR + vuelo.getHoraSal()  
						+ SQLQuerys.SEPARATOR + vuelo.getDurViaje() + SQLQuerys.SEPARATOR + vuelo.getPrecio() + SQLQuerys.SEPARATOR + 
						vuelo.getFechaRegreso() + SQLQuerys.SEPARATOR + vuelo.getHoraRegreso() + SQLQuerys.SEPARATOR + 
						vuelo.getDuracionRegreso()+ SQLQuerys.SEPARATOR + vuelo.getCodAeroliRegreso() + SQLQuerys.SEPARATOR + vuelo.getPrecioTotal() + SQLQuerys.SEPARATOR + 
						vuelo.getCodigoVueloVuelta() + SQLQuerys.END_BLOCK);
						
				
				sentencia.executeUpdate(sql);
				
				
			}catch(SQLException sqle) {
				
				System.out.println("Error con la base de datos "+ sqle.getMessage() );
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
		
		public ArrayList<Aeropuerto> buscarTodosAeropuertos(){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Aeropuerto> aeropuertos = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_AEROPUERTO;
				sentencia=conexion.prepareStatement(sql);
				resultset = sentencia.executeQuery();
				aeropuertos = new ArrayList<Aeropuerto>();
				while (resultset.next()) {
					Aeropuerto aeropuerto =new Aeropuerto();
					aeropuerto.setCodAero(resultset.getString("CodigoIATA"));
					aeropuerto.setLugarAero(resultset.getString("NombreAeropuerto"));
					aeropuertos.add(aeropuerto);
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
			
			return aeropuertos;
			
		}
		public ArrayList<Aerolinea> buscarTodosAerolineas(){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Aerolinea> aerolineas = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_AEROLINEAS;
				sentencia=conexion.prepareStatement(sql);
				resultset = sentencia.executeQuery();
				aerolineas = new ArrayList<Aerolinea>();
				while (resultset.next()) {
					Aerolinea aerolinea =new Aerolinea();
					aerolinea.setCodAeroli(resultset.getString("CodigoAerolinea"));
					aerolinea.setLugarAeroli(resultset.getString("NombreAerolinea"));
					aerolineas.add(aerolinea);
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
			
			return aerolineas;
			
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
		
		public ArrayList<Viaje> buscarTodosViajes(ArrayList<Pais> paises, Agencias agencia){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Viaje> viajes = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_VIAJES;
				sentencia=conexion.prepareStatement(sql);
				sentencia.setString(1, agencia.getAgenciaId());
				resultset = sentencia.executeQuery();
				viajes = new ArrayList<Viaje>();
				while (resultset.next()) {
					Viaje viaje =new Viaje();
					viaje.setAgencia(agencia);
					viaje.setViajesId(resultset.getString("ViajeID"));
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
		
		public ArrayList<Alojamiento> buscarTodosAlojamientos(Viaje viaje){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Alojamiento> alojamientos = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_ALOJAMIENTOS;
				sentencia=conexion.prepareStatement(sql);
				sentencia.setString(1, viaje.getViajesId());
				resultset = sentencia.executeQuery();
				alojamientos = new ArrayList<Alojamiento>();
				while (resultset.next()) {
					Alojamiento alojamiento =new Alojamiento();
					alojamiento.setEventoId(resultset.getString("AlojamientoID"));
					alojamiento.setViaje(viaje);
					alojamiento.setNombre(resultset.getString("NombreEvento"));
					alojamiento.setNMBHotel(resultset.getString("NombreHotel"));
					alojamiento.setFecEntrada(resultset.getString("FechaEntrada"));
					alojamiento.setFecSalida(resultset.getString("FechaSalida"));
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
		
		public ArrayList<Otros> buscarTodosOtros(Viaje viaje){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Otros> otros = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_OTROS;
				sentencia=conexion.prepareStatement(sql);
				sentencia.setString(1, viaje.getViajesId());
				resultset = sentencia.executeQuery();
				otros = new ArrayList<Otros>();
				while (resultset.next()) {
					Otros otro =new Otros();
					otro.setEventoId(resultset.getString("ActividadID"));
					otro.setViaje(viaje);
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
		
		public ArrayList<Vuelo> buscarTodosVuelos(Viaje viaje){
			Connection conexion =null;
			PreparedStatement sentencia=null;
			ResultSet resultset = null;
			ArrayList<Vuelo> vuelos = null;				
			try {
				Class.forName(DButils.DRIVER);
				conexion = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
				String sql = SQLQuerys.SELECT_TODOS_VUELOS;
				sentencia=conexion.prepareStatement(sql);
				sentencia.setString(1, viaje.getViajesId());
				resultset = sentencia.executeQuery();
				vuelos = new ArrayList<Vuelo>();
				while (resultset.next()) {
					Vuelo vuelo =new Vuelo();
					vuelo.setEventoId(resultset.getString("VueloID"));
					vuelo.setViaje(viaje);
					vuelo.setNombre(resultset.getString("NombreEvento"));
					vuelo.setFecSal(resultset.getString("FechaSalida"));
					vuelo.setAeropuertoOrigen(resultset.getString("AeropuertoOrigen"));
					vuelo.setAeropuertoDestino(resultset.getString("AeropuertoDestino"));
					vuelo.setHoraSal(resultset.getString("HoraSalida"));
					vuelo.setDurViaje(resultset.getString("Duracion"));
					vuelo.setCodVuelo(resultset.getString("CodigoVuelo"));
					vuelo.setFechaRegreso(resultset.getString("FechaRegreso"));
					vuelo.setHoraRegreso(resultset.getString("HoraRegreso"));
					vuelo.setDuracionRegreso(resultset.getString("DuracionRegreso"));
					vuelo.setPrecioTotal(resultset.getString("PrecioTotal"));
					vuelo.setCodigoVueloVuelta(resultset.getString("CodigoVueloVuelta"));
					vuelo.setAeropuertoOrigenVuelta(resultset.getString("AeropuertoOrigenVuelta"));
					vuelo.setAeropuertoDestinoVuelta(resultset.getString("AeropuertoDestinoVuelta"));
					vuelo.setPrecio(resultset.getString("Precio"));
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
		public boolean eliminarViaje(Viaje viaje) {
		    Connection conexion = null;
		    PreparedStatement sentencia = null;
		    boolean eliminado = false; 
		    
		    try {
		        Class.forName(DButils.DRIVER);
		        conexion = DriverManager.getConnection(DButils.URL, DButils.USER, DButils.CONTRASEÑA);
		        
		        String sql = SQLQuerys.DELETE_ELIMINAR_VIAJE;
		        sentencia = conexion.prepareStatement(sql);
		        sentencia.setString(1, viaje.getViajesId());
		        int filasAfectadas = sentencia.executeUpdate();
		        if (filasAfectadas > -1) {
		        	eliminado = true;
		        }
		        
		    } catch (SQLException sqle) {
		        System.out.println("Error con la base de datos: " + sqle.getMessage());
		    } catch (Exception e) {
		        System.out.println("Error genérico: " + e.getMessage());
		    } finally {
		        try {
		            if (sentencia != null) {
		                sentencia.close();
		            }
		            if (conexion != null) {
		                conexion.close();
		            }
		        } catch (SQLException e) {
		            System.out.println("Error al cerrar recursos: " + e.getMessage());
		        }
		    }
		    
		    return eliminado;
		}
		public boolean eliminarVuelo(Vuelo vuelo) {
		    Connection conexion = null;
		    PreparedStatement sentencia = null;
		    boolean eliminado = false; 
		    
		    try {
		        Class.forName(DButils.DRIVER);
		        conexion = DriverManager.getConnection(DButils.URL, DButils.USER, DButils.CONTRASEÑA);
		        
		        String sql = SQLQuerys.DELETE_ELIMINAR_VUELO;
		        sentencia = conexion.prepareStatement(sql);
		        sentencia.setString(1, vuelo.getEventoId());
		        int filasAfectadas = sentencia.executeUpdate();
		        if (filasAfectadas > -1) {
		        	eliminado = true;
		        }
		        
		    } catch (SQLException sqle) {
		        System.out.println("Error con la base de datos: " + sqle.getMessage());
		    } catch (Exception e) {
		        System.out.println("Error genérico: " + e.getMessage());
		    } finally {
		        try {
		            if (sentencia != null) {
		                sentencia.close();
		            }
		            if (conexion != null) {
		                conexion.close();
		            }
		        } catch (SQLException e) {
		            System.out.println("Error al cerrar recursos: " + e.getMessage());
		        }
		    }
		    
		    return eliminado;
		}
		public boolean eliminarAlojamiento(Alojamiento alojamiento) {
		    Connection conexion = null;
		    PreparedStatement sentencia = null;
		    boolean eliminado = false; 
		    
		    try {
		        Class.forName(DButils.DRIVER);
		        conexion = DriverManager.getConnection(DButils.URL, DButils.USER, DButils.CONTRASEÑA);
		        
		        String sql = SQLQuerys.DELETE_ELIMINAR_ALOJAMIENTO;
		        sentencia = conexion.prepareStatement(sql);
		        sentencia.setString(1, alojamiento.getEventoId());
		        int filasAfectadas = sentencia.executeUpdate();
		        if (filasAfectadas > -1) {
		        	eliminado = true;
		        }
		        
		    } catch (SQLException sqle) {
		        System.out.println("Error con la base de datos: " + sqle.getMessage() + alojamiento.getEventoId());
		    } catch (Exception e) {
		        System.out.println("Error genérico: " + e.getMessage());
		    } finally {
		        try {
		            if (sentencia != null) {
		                sentencia.close();
		            }
		            if (conexion != null) {
		                conexion.close();
		            }
		        } catch (SQLException e) {
		            System.out.println("Error al cerrar recursos: " + e.getMessage());
		        }
		    }
		    
		    return eliminado;
		}
		public boolean eliminarOtros(Otros otros) {
		    Connection conexion = null;
		    PreparedStatement sentencia = null;
		    boolean eliminado = false; 
		    
		    try {
		        Class.forName(DButils.DRIVER);
		        conexion = DriverManager.getConnection(DButils.URL, DButils.USER, DButils.CONTRASEÑA);
		        
		        String sql = SQLQuerys.DELETE_ELIMINAR_OTROS;
		        sentencia = conexion.prepareStatement(sql);
		        sentencia.setString(1, otros.getEventoId());
		        int filasAfectadas = sentencia.executeUpdate();
		        if (filasAfectadas > -1) {
		        	eliminado = true;
		        }
		        
		    } catch (SQLException sqle) {
		        System.out.println("Error con la base de datos: " + sqle.getMessage());
		    } catch (Exception e) {
		        System.out.println("Error genérico: " + e.getMessage());
		    } finally {
		        try {
		            if (sentencia != null) {
		                sentencia.close();
		            }
		            if (conexion != null) {
		                conexion.close();
		            }
		        } catch (SQLException e) {
		            System.out.println("Error al cerrar recursos: " + e.getMessage());
		        }
		    }
		    
		    return eliminado;
		}
		public static Agencias autentificarAgencia(String usuario, String contraseña) {

		    String sql = "SELECT * FROM Agencias WHERE Nombre = ? AND contraseña = ?";
		    Agencias agencia = null;
		    try (Connection conn = DriverManager.getConnection(DButils.URL,DButils.USER,DButils.CONTRASEÑA);
		        PreparedStatement stmt = conn.prepareStatement(sql)) {
		    	
		        stmt.setString(1, usuario);
		        stmt.setString(2, contraseña);

		        ResultSet rs = stmt.executeQuery();

		        

		        if (rs.next()) {
		        	agencia = new Agencias();
		        	agencia.setAgenciaId(rs.getString("AgenciaID"));
		        	agencia.setAgenciaColorMarca(rs.getString("ColorMarca"));
		        	agencia.setAgenciaLogo(rs.getString("LogoURL"));
		        	agencia.setAgenciaNombre(rs.getString("Nombre"));
		        	agencia.setAgenciaNumEmple(rs.getString("NumEmpleados"));
		        	agencia.setAgenciaTipo(rs.getString("TipoAgencia"));
		        	agencia.setContraseña(rs.getString("Contraseña"));
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return agencia;

		}
		

}
