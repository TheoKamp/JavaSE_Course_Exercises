import java.util.Random;

class Teacher {

    /* grade(): TAKES A STUDENT AND
       SETS THE GRADE WITH RANDOM VALUE */
    void grade(Student s) {
        Random r = new Random();

        s.exerc1 = 1.0+r.nextInt(10);
        s.exerc2 = 1.0+r.nextInt(10);
        s.testGrade = 1.0+r.nextInt(10);
    }
}
