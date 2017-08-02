package hackerrank.thirtydaysofcode;

public class Day12 {

    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

        static class Student extends Person {
            private int[] testScores;

            Student(String firstName, String lastName, int identification, int[] scores) {
                super(firstName, lastName, identification);
                this.testScores = scores;
            }

            public char calculate() {
                int i, sum = 0, avg;
                char grade;
                for (i = 0; i < testScores.length; i++)
                    sum += testScores[i];
                avg = sum / testScores.length;

                if (avg < 40)
                    return 'T';
                else if (avg < 55)
                    return 'D';
                else if (avg < 70)
                    return 'P';
                else if (avg < 80)
                    return 'A';
                else if (avg < 90)
                    return 'E';
                else if (avg <= 100)
                    return 'O';
                else
                    return '0';
            }
        }
    }
}
