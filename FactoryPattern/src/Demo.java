import java.util.Scanner;

public class Demo {

    public static void main(String[] args){

       EnemyShipFactory shipFactory = new EnemyShipFactory();

       EnemyShip theEnemy = null;

       Scanner userInput = new Scanner(System.in);

       System.out.println("What type ship? (U / R / B / BR)");

       if(userInput.hasNextLine()){

           String typeOfShip = userInput.nextLine();

           theEnemy = shipFactory.makeEnemyShip(typeOfShip);

       }

       if(theEnemy != null){

           doStuffEnemy(theEnemy);

       }else System.out.println("enemy ship is null. try again");

    }

    private static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }

}
