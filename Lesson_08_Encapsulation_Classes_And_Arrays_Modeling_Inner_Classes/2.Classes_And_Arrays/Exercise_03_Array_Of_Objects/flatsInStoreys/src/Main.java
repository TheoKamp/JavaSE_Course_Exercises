/*
    Exercise 4: The apartments on the floors
        Extend the program in Example 4:
            • Construct a class called Flat, with a number of members
              contains (people). Initialize to 0.
              Modify Storey: Contains a table with
              apartments. The constructor to initialize the array with
              cFlats apartments on each floor (cFlats, that is to be parameter).
            • Modify the Building: The constructor accepts as extra
              parameter and the number of apartments on each floor
            • Modify the methods of all classes accordingly
              so that the number of people is stored in the apartment
              (and no longer in the floor-storey).
*/
import java.util.Random;

class Main {

    public static void main(String[] args) {
        /* DEFINE A RANDOM OBJECT FOR THE NUMBER OF PEOPLES IN
           A FLAT FOR DEMONSTRATION PURPOSES */
        Random randPeople = new Random();

        /* DEFINE A BUILDING OBJECT WITH 3 STOREYS AND 2 FLATS
           IN A STOREY */
        Building building = new Building(3, 3);

        /* SETTING THE NUMBER OF PEOPLES IN A FLAT WITH HELP
           FROM THE RANDOM OBJECT */
        for (int i = 0; i < building.getBuildingLength(); i++)
            for (int j = 0; j < building.getStoreysFlats(i); j++)
                building.addPeople(i, j, 1+randPeople.nextInt(4));

        /* PRINT THE BUILDING */
        building.printBuilding();
    }
}
