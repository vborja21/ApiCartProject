package pe.cibertec.ecommerce.ApiCart.Service;

import pe.cibertec.ecommerce.ApiCart.dto.Pedido;
import pe.cibertec.ecommerce.ApiCart.dto.PedidoResponse;

public interface ApiCartService {
    public PedidoResponse placeOrder(Pedido pedido);
}
