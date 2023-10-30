package pe.cibertec.ecommerce.ApiCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCart.Service.ApiCartService;
import pe.cibertec.ecommerce.ApiCart.dto.Pedido;
import pe.cibertec.ecommerce.ApiCart.dto.PedidoResponse;

@RestController
@RequestMapping("api/v1/ApiCart")
public class ApiCartController {
    @Autowired
    private ApiCartService apiCartService;
    @PostMapping("/placeOrder")
    public PedidoResponse placeOrder(
            @RequestBody Pedido pedido){
        return apiCartService.placeOrder(pedido);
    }
}
