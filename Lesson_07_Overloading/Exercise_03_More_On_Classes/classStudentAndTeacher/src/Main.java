/*
    Exercise 3:
        Construct the student class
            • Members: Name, Surname, Degree 1, Degree
              2, Grade of Writing
            • Manufacturer: Initialize only the first and last name
            • Manufacturer: Initialize only the first name, last name and
              the grades of the work
            • gradeAssignment method1: To set the grade of the work 1
              equal to the argument.
            • gradeAssignment method2: To set the grade of the work 2
              equal to the argument.
            • gradeFinalExam method: To set the grade of the final
              extension equal to the argument.
            • FinalGrade method: Returns the final grade (average
              condition of three points)
            Define a Teacher class. Have a method named grade η
            which will take as a argument a student, will grade him (with
            random way) and will print his score.
            Also construct in main the appropriate example to
            highlights the above functionality.
*/

class Main {

    public static void main(String[] args) {
        /* DEFINE A STUDENT AND TEACHER */
        Student stu = new Student("John", "Doe");
        Teacher teach = new Teacher();

        /* TEACHER SET THE GRADES */
        teach.grade(stu);

        /* PRINT THE GRADES AND THE AVERAGE */
        System.out.println("STUDENT   : " + stu.name + " " + stu.surname);
        System.out.println("EXERCISE 1: " + stu.exerc1);
        System.out.println("EXERCISE 2: " + stu.exerc2);
        System.out.println("FINAL TEST: " + stu.testGrade);
        System.out.println("AVERAGE   : " + stu.finalGrade());
    }
}
