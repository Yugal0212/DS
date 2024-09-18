//Create array of object of class Student_Detail with attributes Enrollment_No, 
// Name, Semester, CPI for 5 students, scan their information and print it.

import java.util.Scanner;

class Student_Detail {
    long Enrollment_No;
    String Name;
    int Semester;
    double CPI;

    Student_Detail(long Enrollment_No, String Name, int Semester, double CPI) {
        this.Enrollment_No = Enrollment_No;
        this.Name = Name;
        this.Semester = Semester;
        this.CPI = CPI;

    }

    void display() {
        System.out.println("Enrollment_No:-" + Enrollment_No);
        System.out.println("Name:-" + Name);
        System.out.println("Semester:-" + Semester);
        System.out.println("CPI:-" + CPI);
    }
}

public class Lab6_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of student:- ");
        int n = sc.nextInt();

        Student_Detail[] s = new Student_Detail[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter Enrollment_No:-");
            long Enrollment_No = sc.nextLong();
            System.out.println("enter Name:-");
            String Name = sc.next();
            System.out.println("enter Semester:- ");
            int Semester = sc.nextInt();
            System.out.println("enter CPI:-");
            double CPI = sc.nextDouble();
            s[i] = new Student_Detail(Enrollment_No, Name, Semester, CPI);
            s[i].display();
        }

    }
}
