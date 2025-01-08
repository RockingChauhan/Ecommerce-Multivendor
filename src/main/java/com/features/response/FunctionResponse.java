package com.features.response;

import com.features.dto.OrderHistory;
import com.features.model.Cart;
import com.features.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
