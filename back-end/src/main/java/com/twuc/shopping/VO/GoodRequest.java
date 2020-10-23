package com.twuc.shopping.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoodRequest {
    private String name;
    private BigDecimal price;
    private String unit;
    private String imageUrl;
}
