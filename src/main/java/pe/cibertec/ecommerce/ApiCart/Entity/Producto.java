package pe.cibertec.ecommerce.ApiCart.Entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Embeddable
public class Producto {
    private Long Id_Producto;
    private String nom_prod;
    private String des_prod;
    private BigDecimal quantity;
    private String rang_prod;
}
