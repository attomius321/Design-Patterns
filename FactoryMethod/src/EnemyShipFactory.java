public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        if (newShipType.equals("U")) {

            return new UFOEnemyShip();

        } else if (newShipType.equals("R")) {

            return new RocketEnemyShip();

        } else if (newShipType.equals("B")) {

            return new BigUFOEnemyShip();

        } else if (newShipType.equals("S")) {

            return new SuperBigRocketEnemyShip();

        } else return null;

    }

}
