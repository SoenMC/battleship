package co.edu.umanizales.battleship.controller;


import co.edu.umanizales.battleship.model.PlayerDTO;
import co.edu.umanizales.battleship.model.UserDTO;
import co.edu.umanizales.battleship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getUsers()
    {
        return userService.listUsers();
    }

    @PostMapping
    public String createPlayer(@RequestBody @Valid PlayerDTO player)
    {
        return userService.createPlayer(player.getPlayer(), player.getNumPlayer());
    }
}
