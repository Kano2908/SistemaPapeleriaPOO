package Logica;

public class Servicio {
    private int idServicio;
    private double costo;
    private String disponibilidad;
    private String tipoServicio;
    private String descripcion;

    public Servicio() {
    }

    public Servicio(int idServicio, double costo, String disponibilidad, String tipoServicio, String descripcion) {
        this.idServicio = idServicio;
        this.costo = costo;
        this.disponibilidad = disponibilidad;
        this.tipoServicio = tipoServicio;
        this.descripcion = descripcion;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
