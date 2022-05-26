package co.edu.umanizales.battleship.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Coordinate {
    private int x;
    private int y;
    private boolean state;
}
