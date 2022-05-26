package co.edu.umanizales.battleship.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class UserDTO {
    @NotNull
    private String email;
    @Valid
    @NotNull
    private String typeUser;


}
