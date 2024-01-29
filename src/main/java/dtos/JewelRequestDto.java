package dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record JewelRequestDto(

    @NotNull
    Integer price,

    @NotBlank
    String name
){

}
