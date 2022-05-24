class Student {
    String name;
    String surname;
    double exerc1; // Exercise 1 grade
    double exerc2; // Exercise 2 grade
    double testGrade; // Test grade

    /* CONSTRUCTOR INITIALIZE NAME AND SURNAME */
    Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /* CONSTRUCTOR INITIALIZE NAME, SURNAME
       AND EXERCISES GRADES */
    Student(String name, String surname, double exerc1, double exerc2) {
        this.name = name;
        this.surname = surname;
        this.exerc1 = exerc1;
        this.exerc2 = exerc2;
    }

    /* gradeAssignment1(): SET THE GRADE IN EXERCISE 1 */
    void gradeAssignment1(double grade) {
        exerc1 = grade;
    }

    /* gradeAssignment2(): SET THE GRADE IN EXERCISE 2 */
    void gradeAssignment2(double grade) {
        exerc2 = grade;
    }

    /* gradeFinalExam(): SET THE GRADE IN TEST GRADE */
    void gradeFinalExam(double grade) {
        testGrade = grade;
    }

    /* finalGrade(): RETURNS THE AVERAGE GRADE OF
       EXERCISES AND THE FINAL TEST */
    double finalGrade() {
        return (exerc1+exerc2+testGrade) / 3;
    }


}
