package com.twuc.shopping.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Good {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @NotNull
    private String name;

    @DecimalMin("0.01")
    @DecimalMax("99999999.99")
    private BigDecimal price;

    @NotNull
    private String unit;

    @NotNull
    private String imageUrl;
}
