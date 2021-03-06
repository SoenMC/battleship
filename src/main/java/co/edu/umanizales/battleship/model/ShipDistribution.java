package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class ShipDistribution {
    private Ship ship;
    private String state;
    private Coordinate[] coordinates;
    private byte orientation;

    public ShipDistribution(Ship ship) {
        this.ship = ship;
        this.coordinates = new Coordinate[ship.getNumPlaces()];
        this.state="FREE";
    }

    public boolean validateCoordinateExist(Coordinate coordinate)
    {
        if(this.orientation ==0)
            return false;
        for(Coordinate coord: this.coordinates)
        {
            if(coord.getX()==coordinate.getX() && coord.getY()==coordinate.getY() )
            {
                return true;
            }
        }
        return false;
    }


}
