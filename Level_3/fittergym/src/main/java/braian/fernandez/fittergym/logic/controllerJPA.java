
package braian.fernandez.fittergym.logic;

import braian.fernandez.fittergym.persistence.controllerPersistence;

public class controllerJPA {
    controllerPersistence controladoraJPA = new controllerPersistence();
    
    public void crearCliente(clientes cliente){
        controladoraJPA.cearCliente(cliente);
    }
    
    public void crearPedidos(pedidos pedido){
        controladoraJPA.cearPedidos(pedido);
    }
    
    public void cearProductos(productos producto){
        controladoraJPA.cearProductos(producto);
    }
}
