public class Student {
    static int scholarship;

    String firstName;
    static String lastName;
    String group;
  

    public static int getScholarship(int averageMark){
        if (averageMark == 5) {
            scholarship = 2000;
            return scholarship;
        }
        else {
            scholarship = 1900;
            return scholarship;
        }
    }

    static class Aspirant extends Student {
        static int scholarship;

        public static int getScholarship(int averageMark){
            if (averageMark == 5) {
                scholarship = 2500;
                return scholarship;
            }
            else {
                scholarship = 2200;
                return scholarship;
            }
        }

    }

}
