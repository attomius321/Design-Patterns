//all the decision comes here

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        EnemyShip newShip = null;

        if(newShipType.equalsIgnoreCase("U")){

            return new UFOEnemyShip(); 

        } else if(newShipType.equalsIgnoreCase("R")){

            return new RocketEnemyShip();

        } else if(newShipType.equalsIgnoreCase("B")){

            return new BigUFOEnemyShip();

        } else if(newShipType.equalsIgnoreCase("BR")){

            return new BigRocketEnemyShip();

        } else return null;

    }

}
