package ar.edu.unju.fi.controller;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Pasajero;

/** @author AlvarezCarlosMatias
 * @version 23/09/14
 */
public class PasajeroController {

    private List<Pasajero> listaPasajeros;
	private List<String> listaOrigenes;
	private List<String> listaDestinos;
	private List<String> listaClases;
	private String estado;
    
    public PasajeroController(){

		listaPasajeros = new ArrayList<Pasajero>();
		listaOrigenes = new ArrayList<String>();
		listaDestinos = new ArrayList<String>();
		listaClases = new ArrayList<String>();
	} 
    public void agregarPasajero(Pasajero pasajero){
		listaPasajeros.add(pasajero);		
	}
	public void agregarOrigen(String origen){
		listaOrigenes.add(origen);
		listaOrigenes.add("San Salvador de Jujuy");
		listaOrigenes.add("Resistencia");//Capital de Chaco		
	}
	public void agregarDestino(String destino){
		listaDestinos.add(destino);	
		listaDestinos.add("Salta");	
		listaDestinos.add("Cordoba");	
	}
	public void agregarClases(String clase){
		listaClases.add(clase);
		listaClases.add("Economy");	
		listaClases.add("Business");	
	}
	public void cancelarReserva() {
		this.estado = "Cancelada";
	}
	public void pagarReserva() {
		this.estado = "Pagada";
	}
	//Pasajero y Acompañante
    /**
     * @param estado
     * @return lista resultadoEstado muestra una lista con pasajeros segun el estado elegido
     */
    public List<Pasajero> listarEstado(String estado) {
		List<Pasajero> resultadoEstado = new ArrayList<Pasajero>();
		
		for(Pasajero pasajero: listaPasajeros) {
			if(pasajero.getEstado().equalsIgnoreCase(estado))
				resultadoEstado.add(pasajero);
		}
		return resultadoEstado;
    }
}