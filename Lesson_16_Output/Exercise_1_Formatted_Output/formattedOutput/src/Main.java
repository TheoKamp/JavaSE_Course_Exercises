/** Exercise 1:
        Define a Person class with two members: name and salary.
        Then in the main build a board with 5 people, having initialize objects appropriately.
        Then print a table in the following format:
             +---+--------------------+---------+
             | 1 |Daniel Day Lewis    |  1014.14|
             | 2 |Jeremy Irons        |   488.09|
             | 3 |Anthony Hopkins     |    12.13|
             | 4 |Al Pacino           |   134.09|
             | 5 |Tom Hanks           |  1313.19|
             +---+--------------------+---------+
        (The width of the column with the name is 20 and the width of the column with salary is 9)
 */

public class Main {

    public static void printBoard(Person[] per) {
        System.out.println("+---+--------------------+---------+");
        System.out.println("|   |        ACTOR       |  SALARY |");
        System.out.println("+---+--------------------+---------+");
        for (int i = 0; i < per.length; i++) {
            System.out.printf("| %d |%-20s|%9.2f|\n", i+1, per[i].getFullName(), per[i].getSalary());
        }
        System.out.println("+---+--------------------+---------+");
    }

    public static void main(String[] args) {
        Person[] actors = new Person[5];

        actors[0] = new Person("Daniel Day Lewis", 1014.14);
        actors[1] = new Person("Jeremy Irons", 488.09);
        actors[2] = new Person("Anthony Hopkins", 12.13);
        actors[3] = new Person("Al Pacino", 134.09);
        actors[4] = new Person("Tom Hanks", 1313.19);

        printBoard(actors);

    }
}
