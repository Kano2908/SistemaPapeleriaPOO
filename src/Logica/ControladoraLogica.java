package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public List<Servicio> traerServicios() {
        return controlPersis.traerServicios();
    }

    public void guardarServicio(String tipoServicio, String descripcion, Double costo, String disponibilidad) {
        
        Servicio xServicio = new Servicio();
        
        xServicio.setTipoServicio(tipoServicio);
        xServicio.setDescripcion(descripcion);
        xServicio.setCosto(costo);
        xServicio.setDisponibilidad(disponibilidad);
        
        controlPersis.guardarServicio(xServicio);
    }

    public Servicio traerServicio(int idServicio) {
        return controlPersis.traerServicio(idServicio);
    }

    public void modificarServicio(String idServicio, String tipoServicio, String descripcion, double costo, String disponibilidad) {
        int idServi = Integer.parseInt(idServicio);
        
        Servicio xServicio = new Servicio();
        
        xServicio.setIdServicio(idServi);
        xServicio.setTipoServicio(tipoServicio);
        xServicio.setDescripcion(descripcion);
        xServicio.setCosto(costo);
        xServicio.setDisponibilidad(disponibilidad);
        
        controlPersis.modificarServicio(xServicio);
    }

    public void eliminarServicio(int idServicio) {
        controlPersis.eliminarServicio(idServicio);
    }

    public List<Producto> traerProductos() {
        return controlPersis.traerProductos();
    }

    public void guardarProducto(String nombre, String descripcion, Double precio) {        
        Producto xProducto = new Producto();
        
        xProducto.setNombre(nombre);
        xProducto.setDescripcion(descripcion);
        xProducto.setPrecio(precio);
        
        controlPersis.guardarProducto(xProducto);
    }

    public Producto traerProducto(int idProducto) {
        return controlPersis.traerProducto(idProducto);
    }

    public void modificarProducto(String idProducto, String nombre, String descripcion, double precio, int stock) {
        int idProduc = Integer.parseInt(idProducto);

        Producto xProducto = new Producto();
        
        xProducto.setIdProducto(idProduc);
        xProducto.setNombre(nombre);
        xProducto.setDescripcion(descripcion);
        xProducto.setPrecio(precio);
        xProducto.setStock(stock);
        
        controlPersis.modificarProducto(xProducto);
    }

    public void eliminarProducto(int idProducto) {
        controlPersis.eliminarProducto(idProducto);
    }

    public List<Proveedor> traerProveedores() {
        return controlPersis.traerProveedores();
    }

    public void guardarProveedor(String nombre, String ubicacion, String telefono, String email) {
        Proveedor xProveedor = new Proveedor();
        
        xProveedor.setNombre(nombre);
        xProveedor.setUbicacion(ubicacion);
        xProveedor.setTelefono(telefono);
        xProveedor.setEmail(email);
        
        controlPersis.guardarProveedor(xProveedor);
    }

    public Proveedor traerProveedor(int idProveedor) {
        return controlPersis.traerProveedor(idProveedor);
    }

    public void modificarProveedor(String idProveedor, String nombre, String ubicacion, String telefono, String email) {
        int idProve = Integer.parseInt(idProveedor);
        
        Proveedor xProveedor = new Proveedor();
        
        xProveedor.setIdProveedor(idProve);
        xProveedor.setNombre(nombre);
        xProveedor.setUbicacion(ubicacion);
        xProveedor.setTelefono(telefono);
        xProveedor.setEmail(email);
        
        controlPersis.modificarProveedor(xProveedor);
    }

    public void eliminarProveedor(int idProveedor) {
        controlPersis.eliminarProveedor(idProveedor);
    }

    public List<Empleado> traerEmpleados() {
        return controlPersis.traerEmpleados();
    }

    public void guardarEmpleado(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono) {
        Empleado xEmpleado = new Empleado();
        
        xEmpleado.setNombre(nombre);
        xEmpleado.setApellidoPaterno(apellidoPaterno);
        xEmpleado.setApellidoMaterno(apellidoMaterno);
        xEmpleado.setDireccion(direccion);
        xEmpleado.setTelefono(telefono);
        
        controlPersis.guardarEmpleado(xEmpleado);
    }

    public Empleado traerEmpleado(int idEmpleado) {
        return controlPersis.traerEmpleado(idEmpleado);
    }

    public void modificarEmpleado(String idEmpleado, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono) {
        int idEmple = Integer.parseInt(idEmpleado);
        
        Empleado xEmpleado = new Empleado();
        
        xEmpleado.setIdEmpleado(idEmple);
        xEmpleado.setNombre(nombre);
        xEmpleado.setApellidoPaterno(apellidoPaterno);
        xEmpleado.setApellidoMaterno(apellidoMaterno);
        xEmpleado.setDireccion(direccion);
        xEmpleado.setTelefono(telefono);
        
        controlPersis.modificarEmpleado(xEmpleado);
    }

    public void eliminarEmpleado(int idEmpleado) {
       controlPersis.eliminarEmpleado(idEmpleado);
    }
}
