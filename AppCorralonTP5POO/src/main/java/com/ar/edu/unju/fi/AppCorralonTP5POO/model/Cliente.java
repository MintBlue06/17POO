package com.ar.edu.unju.fi.AppCorralonTP5POO.model;

/**App para venta y registracion de un corralon
 * @author Alvarez Carlos Matias
 * @version 2023/09/21
 */
public class Cliente {
    
    private static Integer nextId = 1;
    private Integer id;
    private Integer dni;
	private String nombre;
    private String correo;
    private Long telefono;
    private String localidad;
    //private Compra compra;

    /**Id generado de forma secuencial por sistema*/
    public Cliente(/*Integer id, */Integer dni, String nombre, String correo, Long telefono, String localidad/*, Compra compra*/) {
        super();
        this.id = nextId;
        nextId++;
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.localidad = localidad;
        //this.compra = compra;
    }

    public static Integer getNextId() {
        return nextId;
    }

    public static void setNextId(Integer nextId) {
        Cliente.nextId = nextId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public boolean contains(Integer id) {
        return true;
    }

    /*public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }*/       
}
