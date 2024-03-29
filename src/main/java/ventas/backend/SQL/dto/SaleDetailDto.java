package ventas.backend.SQL.dto;

import ventas.backend.SQL.models.Product;
import ventas.backend.SQL.models.Sale;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties({"sale"})
public class SaleDetailDto {

    private Integer id;

    private Integer quantity;

    private BigDecimal discount;

    private BigDecimal subtotal;

    private BigDecimal unitaryPrice;

    private BigDecimal totalWithDiscount;
    // RELATIONS

    // product -> saleDetail

    private Product product;

    // sale -> saleDetail

    //@ManyToOne
    //@JoinColumn
    private Sale sale;


}
