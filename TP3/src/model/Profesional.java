package model;

public class Profesional extends Empleado {
    //Objetos
    private Integer adicionalTitulo;
    private Integer titulo;

    public Integer getTitulo() {
        return titulo;
    }
    public void setTitulo(Integer titulo) {
        this.titulo = titulo;
    }
    @Override
    public Integer getRemuneracionBonificable() {
        return super.getRemuneracionBonificable() + adicionalTitulo;
    }
    //Getters y Setters
    public Integer getAdicionalTitulo() {
        return adicionalTitulo;
    }

    public void setAdicionalTitulo(Integer adicionalTitulo) {//Calcular adicional por nro de titulos
        this.adicionalTitulo = titulo * 80000;
    }
}
