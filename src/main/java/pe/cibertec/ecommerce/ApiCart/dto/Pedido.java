package pe.cibertec.ecommerce.ApiCart.dto;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import pe.cibertec.ecommerce.ApiCart.Entity.Order;
import pe.cibertec.ecommerce.ApiCart.Entity.OrderItem;

@Getter
@Setter
public class Pedido {
    private Order order;
    private Set<OrderItem> orderItems; 
}
