package com.ar.edu.unju.fi.AppCorralonTP5POO.controller;

import java.util.ArrayList;
import java.util.List;

import com.ar.edu.unju.fi.AppCorralonTP5POO.exceptions.ModelException;
import com.ar.edu.unju.fi.AppCorralonTP5POO.model.Cliente;
import com.ar.edu.unju.fi.AppCorralonTP5POO.model.SistemaCompra;

/**Controlador o Manager de un Cliente
 * @author Alvarez Carlos Matias
 * @version 2023/09/21
 */
public class ClienteController {

    private List<Cliente> listaClientes;
	private List<Integer> listaDniClientes;
	private List<String> listaCorreoClientes;
	private List<SistemaCompra> listaCompras;

    public ClienteController() {
		listaClientes = new ArrayList<Cliente>();
		listaDniClientes = new ArrayList<Integer>();
		listaCorreoClientes = new ArrayList<String>();
	}

    public void agregarCliente(Cliente cliente) throws ModelException {
		/**Se va a buscar si el dni proporcionado existe (usando listaDniClientes)
		 *  y en ese caso se activa el mensaje de error (throw)*/
		if(listaDniClientes.contains(cliente.getDni()))
			throw new ModelException("El dni ya se encuentra registrado"); 				
		listaClientes.add(cliente);
		
		/**Se va a buscar si el correo proporcionado existe (usando listaCorreoClientes)
		 *  y en ese caso se activa el mensaje de error (throw)*/
		if(listaCorreoClientes.contains(cliente.getCorreo()))
			throw new ModelException("El correo ya se encuentra registrado"); 				
		listaClientes.add(cliente);
	}

    public void eliminarCliente(Cliente cliente) {
		listaClientes.remove(cliente);
	}
	/**Buscamos clientes por su nombre
	 *  el valor booleano se vuelve true si lo encontro
	 * y nos devuelve el cliente
	 * @param nombre
	 * @return 
	 */
	public Cliente buscarCliente(String nombre) {
		boolean existe = false;

		for(Cliente cliente: listaClientes) {
			if(cliente.getNombre().equalsIgnoreCase(nombre))
				existe = true;
			return cliente;
		}
	
		if (existe) {
			throw new ModelException("El cliente si existe");
		} else {
			throw new ModelException("El cliente no existe");
		}
	}
	/**ListarCorreos de clientes*/
	public List<String> listarCorreos() {
		
		for(Cliente cliente: listaClientes) {
			if(cliente.getCorreo() != null)
				listaCorreoClientes.add(cliente.getCorreo());
		}
		return listaCorreoClientes;
	}
	/**ListarDocumentos (trae numeros de dni de clientes) */
	public List<Integer> listarDocumentos() {
		
		for(Cliente cliente: listaClientes) {
			if(cliente.getDni() != null)
				listaDniClientes.add(cliente.getDni());
		}
		return listaDniClientes;
	}
	/**Un cliente hace una compra ingresando su id
	 *  y al encontrarlo en la listaClientes
	 * la compra va a listaCompras
	 * @param id (de cliente existente)
	 * @param compra
	 */
	public void hacerCompra(Integer id, SistemaCompra compra) {
		listaCompras = new ArrayList<SistemaCompra>();

		for(Cliente cliente: listaClientes) {
			if(cliente.getId().equals(id))
				listaCompras.add(compra);
		}		
	}
}
