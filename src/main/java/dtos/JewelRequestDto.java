package dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record

    @NotNull
    Integer price;

    @NotBlank
    String name;
}
