package pe.cibertec.ecommerce.ApiCart.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCart.Entity.Order;

public interface ApiCartRepository extends JpaRepository<Order, Long>{
    
}
