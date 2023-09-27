package model;

public class Administrativo extends Empleado {
    //Objetos
    private Integer categoria;
    private Integer tipoCategoria;

    @Override
    public Integer getRemuneracionBonificable() {
        return super.getRemuneracionBonificable() + categoria;
    }
    
    public void calcularCategoria() {
        switch (tipoCategoria) {
            case 1:
                categoria += 10000;
                break;
            case 2:
                categoria += 14000;
                break;
            case 3:
                categoria += 18000;
                break;
            case 4:
                categoria += 30000;
                break;
            case 5:
                categoria += 40000;
                break;
            default:
                System.out.println("El tipo de categoria va solamente del 1 al 5");
                break;
        }
    }
    //Getters y Setters
    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
    public Integer getTipoCategoria() {
        return tipoCategoria;
    }
    public void setTipoCategoria(Integer tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
}
