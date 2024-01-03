
package braian.fernandez.fittergym.logic;

import braian.fernandez.fittergym.persistence.controllerPersistence;
import java.util.ArrayList;

public class controllerJPA {
    controllerPersistence persistenceControll = new controllerPersistence();
    
    public void crearCliente(clientes cliente){
        persistenceControll.cearCliente(cliente);
    }
    
    public void crearPedidos(pedidos pedido){
        persistenceControll.cearPedidos(pedido);
    }
    
    public void cearProductos(productos producto){
        persistenceControll.cearProductos(producto);
    }
    
    public void eliminarCliente(int idCliente) {
        persistenceControll.eliminarCliente(idCliente);
    }
    
    public void eliminarPedidos(int idPedidos) {
        persistenceControll.eliminarPedidos(idPedidos);
    }
    
    public void eliminarProductos(int idProducto) {
        persistenceControll.eliminarProductos(idProducto);
    }
    
    public void modificarCliente(clientes clients){
        persistenceControll.modificarCliente(clients);
    }
    
    public void modificarPedido(pedidos pedido){
        persistenceControll.modificarPedido(pedido);
    }
    
    public void modificarProducto(productos producto){
        persistenceControll.modificarProducto(producto);
    }
    
    public clientes mostrarClientes(int idCliente){
        return persistenceControll.mostrarClientes(idCliente);
    }
    
    public pedidos mostrarPedidos(int idPedidos){
        return persistenceControll.mostrarPedidos(idPedidos);
    }
    
    public productos mostrarProductos(int idProducto){
        return persistenceControll.mostrarProductos(idProducto);
    }
    
    public ArrayList<clientes> traerListaClientes(){
        return persistenceControll.traerListaClientes();
    }
    
    public ArrayList<pedidos> traerListaPedidos(){
        return persistenceControll.traerListaPedidos();
    }
    
    public ArrayList<productos> traerListaProductos(){
        return persistenceControll.traerListaProductos();
    }
}
