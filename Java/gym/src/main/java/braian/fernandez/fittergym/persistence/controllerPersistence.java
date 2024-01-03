
package braian.fernandez.fittergym.persistence;

import braian.fernandez.fittergym.logic.clientes;
import braian.fernandez.fittergym.logic.pedidos;
import braian.fernandez.fittergym.logic.productos;
import braian.fernandez.fittergym.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controllerPersistence {
    clientesJpaController clientesJPA = new clientesJpaController();
    pedidosJpaController pedidosJPA = new pedidosJpaController();
    productosJpaController productosJPA = new productosJpaController();

    public void cearCliente(clientes cliente) {
        clientesJPA.create(cliente);
    }
    
    public void cearPedidos(pedidos pedido) {
        pedidosJPA.create(pedido);
    }
    
    public void cearProductos(productos producto) {
        productosJPA.create(producto);
    }
    
    public void eliminarCliente(int idCliente) {
        try {
            clientesJPA.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPedidos(int idPedidos) {
        try {
            pedidosJPA.destroy(idPedidos);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarProductos(int idProducto) {
        try {
            productosJPA.destroy(idProducto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarCliente(clientes clients) {
        try {
            clientesJPA.edit(clients);
        } catch (Exception ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarPedido(pedidos pedido) {
        try {
            pedidosJPA.edit(pedido);
        } catch (Exception ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarProducto(productos producto) {
        try {
            productosJPA.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public clientes mostrarClientes(int idCliente) {
        return clientesJPA.findclientes(idCliente);
    }

    public pedidos mostrarPedidos(int idPedidos) {
        return pedidosJPA.findpedidos(idPedidos);
    }

    public productos mostrarProductos(int idProducto) {
        return productosJPA.findproductos(idProducto);
    }
    
    public ArrayList<clientes> traerListaClientes(){
        List<clientes> listaClientes = clientesJPA.findclientesEntities();
        ArrayList<clientes> arraylistClientes = new ArrayList(listaClientes);
        return arraylistClientes;
    }
    
    public ArrayList<pedidos> traerListaPedidos(){
        List<pedidos> listaPedidos = pedidosJPA.findpedidosEntities();
        ArrayList<pedidos> arraylistPedidos = new ArrayList(listaPedidos);
        return arraylistPedidos;
    }
    
    public ArrayList<productos> traerListaProductos(){
        List<productos> listaProductos = productosJPA.findproductosEntities();
        ArrayList<productos> arraylistProductos = new ArrayList(listaProductos);
        return arraylistProductos;
    }
}
