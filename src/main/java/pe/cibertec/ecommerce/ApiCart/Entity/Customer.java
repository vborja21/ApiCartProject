package pe.cibertec.ecommerce.ApiCart.Entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Customer {
    private Long DNI_Cliente;
    private String nom_cliente;
    private String ape_cliente;
    private Integer edad_cliente;
    private String dir_cliente;
    private Integer tel_cliente;
    private String correo_cliente;
}
