package Persistencia;

import Logica.Empleado;
import Logica.Producto;
import Logica.Proveedor;
import Logica.Servicio;
import java.util.List;

public class ControladoraPersistencia {
    EmpleadoController empleadoC = new EmpleadoController();
    ProductoController productoC = new ProductoController();
    ProveedorController proveedorC = new ProveedorController();
    ServicioController servicioC = new ServicioController();

    public List<Servicio> traerServicios() {
        return servicioC.readServicios();
    }

    public void guardarServicio(Servicio xServicio) {
        servicioC.addServicio(xServicio);
    }

    public Servicio traerServicio(int idServicio) {
        return servicioC.readServicio(idServicio);
    }

    public void modificarServicio(Servicio xServicio) {
        servicioC.updateServicio(xServicio);
    }

    public void eliminarServicio(int idServicio) {
        servicioC.deleteServicio(idServicio);
    }

    public List<Producto> traerProductos() {
        return productoC.readProductos();
    }

    public void guardarProducto(Producto xProducto) {
        productoC.addProducto(xProducto);
    }

    public Producto traerProducto(int idProducto) {
        return productoC.readProducto(idProducto);
    }

    public void modificarProducto(Producto xProducto) {
        productoC.updatePrpducto(xProducto);
    }

    public void eliminarProducto(int idProducto) {
        productoC.deleteServicio(idProducto);
    }

    public List<Proveedor> traerProveedores() {
        return proveedorC.readProveedores();
    }

    public void guardarProveedor(Proveedor xProveedor) {
        proveedorC.addProveedor(xProveedor);
    }

    public Proveedor traerProveedor(int idProveedor) {
        return proveedorC.readProveedor(idProveedor);
    }

    public void modificarProveedor(Proveedor xProveedor) {
        proveedorC.updateProveedor(xProveedor);
    }

    public void eliminarProveedor(int idProveedor) {
        proveedorC.deleteProveedor(idProveedor);
    }

    public List<Empleado> traerEmpleados() {
        return empleadoC.readEmpleados();
    }

    public void guardarEmpleado(Empleado xEmpleado) {
        empleadoC.addEmpleado(xEmpleado);
    }

    public Empleado traerEmpleado(int idEmpleado) {
        return empleadoC.readEmpleado(idEmpleado);
    }

    public void modificarEmpleado(Empleado xEmpleado) {
        empleadoC.updateEmpleado(xEmpleado);
    }

    public void eliminarEmpleado(int idEmpleado) {
        empleadoC.deleteEmpleado(idEmpleado);
    }
}
