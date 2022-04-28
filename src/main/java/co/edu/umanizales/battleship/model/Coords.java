package co.edu.umanizales.battleship.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coords {
    private int x;
    private int y;
    private boolean state;
}