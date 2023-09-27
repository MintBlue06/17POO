package ar.edu.unju.fi.model;

/**Clase Pasajero
 * @author AlvarezCarlosMatias
 * @version 23/09/14
 */
public class Pasajero {

    private Integer dni;
    private String nombre;
    private Float telefono;
    private String correo;
    private String origen;
    private String destino;
    private String fecha;
    private String clase;
    private Boolean acompañante;
    private String estado;

    //public Pasajero();
    
    /**Constructor
     * 
     * @param dni
     * @param nombre
     * @param telefono
     * @param correo
     * @param origen
     * @param destino
     * @param fecha
     * @param clase
     * @param acompañante
     * @param estado
     */
    public Pasajero(Integer dni, String nombre, Float telefono, String correo, String origen, String destino,
            String fecha, String clase, Boolean acompañante, String estado) {

        super();
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.clase = clase;
        this.acompañante = acompañante;
        this.estado = estado;
    }
    /**Getters y Setters
     * 
     */
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

    public Float getTelefono() {
        return telefono;
    }

    public void setTelefono(Float telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Boolean getAcompañante() {
        return acompañante;
    }

    public void setAcompañante(Boolean acompañante) {
        this.acompañante = acompañante;
    }

    public String getEstado() {
        return estado;
    }
    /**Unicamente se puede setear en tres estados a una misma reserva
     * Solo puede existir un tipo de estado a la vez
     * @param estado (de la reserva)
     */
    public void setEstado(String estado) {
        if (estado.equals("Reservada")) {
            this.estado = estado;
        }
        if (estado.equals("Cancelada")) {
            this.estado = estado;
        }
        if (estado.equals("Pagada")) {
            this.estado = estado;
        }
    }
    

}
