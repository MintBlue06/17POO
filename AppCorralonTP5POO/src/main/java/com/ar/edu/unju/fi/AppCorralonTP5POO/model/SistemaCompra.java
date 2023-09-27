package com.ar.edu.unju.fi.AppCorralonTP5POO.model;

import java.time.LocalDate;
/**Clase que permite realizar compras 
 *  @author Alvarez Carlos Matias
 * @version 2023/09/21
 * */
public class SistemaCompra {

    //private String localidad;
    private LocalDate fecha;
    private Integer importe;

    public SistemaCompra(/*String localidad,*/ LocalDate fecha, Integer importe) {
        //this.localidad = localidad;
        this.fecha = fecha;
        this.importe = importe;
    }

    /*public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }*/

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }
}
