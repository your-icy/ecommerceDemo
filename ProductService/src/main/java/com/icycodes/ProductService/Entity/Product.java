package com.icycodes.ProductService.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ProductId")
    private Long productId;

    @Column(name = "Product_Name")
    @NotBlank
    private String productName;

    @Column(name = "Product_Price")
    @NotEmpty
    @PositiveOrZero
    private Long price;


    @Column(name = "Product_Quantity")
    @NotEmpty
    @PositiveOrZero
    private Long quantity;

}
