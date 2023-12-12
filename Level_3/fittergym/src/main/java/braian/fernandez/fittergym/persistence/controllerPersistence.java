
package braian.fernandez.fittergym.persistence;

import braian.fernandez.fittergym.logic.clientes;
import braian.fernandez.fittergym.logic.pedidos;
import braian.fernandez.fittergym.logic.productos;

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
}
