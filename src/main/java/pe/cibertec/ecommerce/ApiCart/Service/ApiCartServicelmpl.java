package pe.cibertec.ecommerce.ApiCart.Service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCart.DAO.ApiCartRepository;
import pe.cibertec.ecommerce.ApiCart.Entity.Order;
import pe.cibertec.ecommerce.ApiCart.dto.Pedido;
import pe.cibertec.ecommerce.ApiCart.dto.PedidoResponse;

@Service
public class ApiCartServicelmpl implements ApiCartService{
    @Autowired
    private ApiCartRepository apiCartRepository;
    
    @Override
    @Transactional
    public PedidoResponse placeOrder(Pedido pedido) {
        Order order = pedido.getOrder();
        order.setTrackingNumber(getTrackingNumber());
        pedido.getOrderItems().forEach(i->{
            order.addOrderItem(i);
        });
        
        apiCartRepository.save(order);
        return 
         new PedidoResponse(order.getTrackingNumber());
        
    }
    
    private String getTrackingNumber(){
        return UUID.randomUUID().toString();
    }
}
