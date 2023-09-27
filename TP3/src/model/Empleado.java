package model;

public class Empleado {
    //Objetos
    private Integer id;
    private Integer legajo;
    private String nombre;
    private Integer fechaNacimiento;
    private Integer cantidadHijos;
    private Integer antiguedad;
    private Integer sueldoFamilar;
    private Integer bonoAntiguedad;
    private Integer remuneracionBonificable;
    private Integer descuento;
    private Integer sueldoNeto;

    public Empleado() {}
    //Constructor
    public Empleado(Integer id, Integer legajo, String nombre, Integer fechaNacimiento, Integer cantidadHijos, Integer antiguedad) {
        
    }
    public Integer getSueldoFamilar() {
        return sueldoFamilar;
    }//Calculo de Sueldo Familiar
    public void setSueldoFamilar(Integer sueldoFamilar) {
        this.sueldoFamilar = cantidadHijos * 7000;
    }

    public Integer getBonoAntiguedad() {
        return bonoAntiguedad;
    }//Calculo del Bono de Antiguedad
    public void setBonoAntiguedad(Integer bonoAntiguedad) {
        this.bonoAntiguedad = antiguedad * 8000;
    }

    public Integer getRemuneracionBonificable() {
        return remuneracionBonificable;
    }//Calculo de Remuneracion Bonificable
    public void setRemuneracionBonificable(Integer remuneracionBonificable) {
        this.remuneracionBonificable = getSueldoBasico() + bonoAntiguedad;
    }

    public Integer getDescuento() {
        return descuento;
    }
    public void setDescuento(Integer descuento) {
        this.descuento = (remuneracionBonificable/100) * 15;
    }

    public Integer getSueldoNeto() {
        return sueldoNeto;
    }
    public void setSueldoNeto(Integer sueldoNeto) {
        this.sueldoNeto = remuneracionBonificable + sueldoFamilar - descuento;
    }
    
    public Integer getSueldoBasico() {
        return 150000; 
    }
    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(Integer cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
}
