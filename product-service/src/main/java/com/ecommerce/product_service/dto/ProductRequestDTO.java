package com.ecommerce.product_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequestDTO(
        @NotBlank(message = "El nombre del producto es requerido")
        String name,

        String description,

        @NotNull(message = "El precio es obligatorio")
        @Positive(message = "El precio del producto debe ser mayor a cero")
        BigDecimal price
) {
}
