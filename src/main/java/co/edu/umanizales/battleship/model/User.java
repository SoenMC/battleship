package co.edu.umanizales.battleship.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String mail;
    private String password;
    private TypeUser typeUser;

    public User(String mail, String password, TypeUser typeUser) {
        this.mail = mail;
        this.password = password;
        this.typeUser = typeUser;
    }
}
