package Junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import Modelo.Aerolinea;
import Modelo.Aeropuerto;
import Modelo.Agencias;
import Modelo.Alojamiento;
import Modelo.Gestor;
import Modelo.Otros;
import Modelo.Pais;
import Modelo.Viaje;
import Modelo.Vuelo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GestorTest {

Agencias agencia;
Alojamiento alojamiento;
Vuelo vuelo;
Otros otro;
Gestor gestor;
Viaje viaje;
ArrayList<Pais> paises;
ArrayList<Vuelo> vuelos;
ArrayList<Alojamiento> alojamientos;
ArrayList<Otros> otros;
ArrayList<Aeropuerto> aeropuertos;
ArrayList<Aerolinea> aerolineas;

@Before
public void empezarGestorAgencia() {

gestor = new Gestor();

aeropuertos = gestor.buscarTodosAeropuertos();
aerolineas = gestor.buscarTodosAerolineas();
paises = gestor.buscarTodosPaises();

agencia = new Agencias();
agencia.setAgenciaNombre("AgenciaPrueba");
agencia.setAgenciaColorMarca("#123456");
agencia.setAgenciaNumEmple("2-10");
agencia.setAgenciaTipo("minorista");
agencia.setAgenciaLogo("Logo");
agencia.setContraseña("JUnit");

viaje = new Viaje();
viaje.setViajesNombre("Viaje");
viaje.setViajesDescripcion("Prueba del viaje");
viaje.setViajesTipo("Novios");
viaje.setViajesFechaInicio("2025-02-02");
viaje.setViajesFechaFin("2025-03-03");
viaje.setViajesDuracion("9");
viaje.setViajesDescServNo("Desayuno");

for (Pais pais : paises) {
if (pais.getDescripcion().equals("ARGENTINA")) {
viaje.setPais(pais);
}

}
}

@Test
public void test01_CrearAgencia() {
boolean crearNuevaAgencia = gestor.insertarAgencia(agencia);
assertNotNull("La agencia no se crea correctamente", crearNuevaAgencia);

}

@Test
public void test02_Login() {

agencia = gestor.autentificarAgencia("AgenciaPrueba", "JUnit");
assertTrue("Login correcto", agencia instanceof Agencias);

}

@Test
public void test03_CrearViaje() {
agencia = gestor.autentificarAgencia("AgenciaPrueba", "JUnit");
viaje.setAgencia(agencia);
boolean crearViaje = gestor.insertarViaje(viaje);
assertNotNull("La agencia no se crea correctamente", crearViaje);

}

@Test
public void test04_CrearVuelo() {
boolean crearVuelo = false;
agencia = gestor.autentificarAgencia("AgenciaPrueba", "JUnit");
viaje.setAgencia(agencia);
Vuelo vuelo = new Vuelo();
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises,agencia);

if (viajes.size() != 0) {
vuelo.setViaje(viajes.get(0));
vuelo.setCodVuelo("123");
vuelo.setFecSal("2025-03-03");
vuelo.setPrecio("123");
vuelo.setHoraSal("00:12:45");
vuelo.setDurViaje("00:12:45");

for (Aerolinea aerolinea : aerolineas) {
if (aerolinea.getCodAeroli().equals("RK")) {
vuelo.setAerolinea(aerolinea);
}
}
for (Aeropuerto aeropuerto : aeropuertos) {
if (aeropuerto.getCodAero().equals("OVD")) {
	vuelo.setAeropuertoOrigen(aeropuerto.getCodAero());
}
}
for (Aeropuerto aeropuerto : aeropuertos) {
if (aeropuerto.getCodAero().equals("OVD")) {
	vuelo.setAeropuertoDestino(aeropuerto.getCodAero());
}
}

crearVuelo = gestor.insertarVueloIda(vuelo);
}
assertNotNull("La agencia no se crea correctamente", crearVuelo);
}

@Test
public void test04_CrearAlojamiento() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
Alojamiento alojamiento = new Alojamiento();
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean crearAlojamiento = false;
if (viajes.size() != 0) {
alojamiento.setViaje(viajes.get(0));
alojamiento.setNMBHotel("Prueba");
alojamiento.setFecEntrada("2025-03-03");
alojamiento.setFecSalida("2025-03-08");
alojamiento.setPrecio("12");
alojamiento.setTipoHab("DB");
alojamiento.setCiudad("Bilbao");
crearAlojamiento = gestor.insertarAlojamiento(alojamiento);
}
assertNotNull("La agencia no se crea correctamente", crearAlojamiento);

}

@Test
public void test04_CrearOtros() {
boolean crearOtros = false;
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
Otros otro = new Otros();
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);

if (viajes.size() != 0) {
otro.setViaje(viajes.get(0));
otro.setNombre("Prueba");
otro.setFecha("2025-02-19");
otro.setPrecio("12");
otro.setDescripcion("Divertido");

crearOtros = gestor.insertarOtros(otro);

}
assertNotNull("La agencia no se crea correctamente", crearOtros);
}

@Test
public void test05_MostrarVuelos() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean mostrar = false;

if (viajes.size() != 0) {

ArrayList<Vuelo> vuelos = gestor.buscarTodosVuelos(viajes.get(0));
mostrar = vuelos.size() != 0;
}
assertTrue("Los vuelos no se cargan", mostrar);
}

@Test
public void test05_MostrarAlojamientos() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean mostrar = false;

if (viajes.size() != 0) {

ArrayList<Alojamiento> alojamientos = gestor.buscarTodosAlojamientos(viajes.get(0));
mostrar = alojamientos.size() != 0;
}
assertTrue("Los alojamientos no se cargan", mostrar);
}

@Test
public void test05_MostrarOtros() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean mostrar = false;

if (viajes.size() != 0) {

ArrayList<Otros> otros = gestor.buscarTodosOtros(viajes.get(0));
mostrar = otros.size() != 0;
}
assertTrue("Los otros eventos no se cargan", mostrar);
}

@Test
public void test05_MostrarViajes() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
assertTrue("No se carga lista de viajes", viajes.size() != 0);

}

@Test
public void test06_EliminarVuelo() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean borrar = false;

if (viajes.size() != 0) {

ArrayList<Vuelo> vuelos = gestor.buscarTodosVuelos(viajes.get(0));
if (vuelos.size() != 0) {
borrar = gestor.eliminarVuelo(vuelos.get(0));
}

}
assertTrue("El vuelo no se elimina", borrar);

}

@Test
public void test06_EliminarAlojamiento() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean borrar = false;

if (viajes.size() != 0) {

ArrayList<Alojamiento> alojamientos = gestor.buscarTodosAlojamientos(viajes.get(0));
if (alojamientos.size() != 0) {
borrar = gestor.eliminarAlojamiento(alojamientos.get(0));
}

}
assertTrue("El vuelo no se elimina", borrar);
}

@Test
public void test06_EliminarOtros() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean borrar = false;
if (viajes.size() != 0) {
ArrayList<Otros> otros = gestor.buscarTodosOtros(viajes.get(0));
if (otros.size() != 0) {
borrar = gestor.eliminarOtros(otros.get(0));
}
}

assertTrue("El otro evento no se elimina", borrar);
}

@Test
public void test05_MostrarAerolineas() {

assertTrue("Las aerolinea no se cargan", aerolineas.size() != 0);
}

@Test
public void test05_MostrarAeropuertos() {
assertTrue("Las aerolinea no se cargan", aeropuertos.size() != 0);
}

@Test
public void test05_MostrarPais() {
assertTrue("Los paises no se cargan", paises.size() != 0);

}

@Test
public void test07_BorrarViaje() {
agencia = gestor.comprobarAgencia(agencia);
viaje.setAgencia(agencia);
ArrayList<Viaje> viajes = gestor.buscarTodosViajes(paises, agencia);
boolean borrar = false;

if (viajes.size() != 0) {
borrar = gestor.eliminarViaje(viajes.get(0));
}
assertTrue("Viaje no eliminado", borrar);
}

}
