package co.edu.umanizales.battleship.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class TypeUser {
    @NotNull
    private int code;
    @Valid
    @NotNull
    private String description;

}
