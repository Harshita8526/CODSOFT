import java.util.*;
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----STUDENT GRADE CALCULATOR----");
        System.out.print("Enter Student Name ");
        String sName = sc.nextLine();
        System.out.print("Enter the number of subjects = ");
        int n = sc.nextInt();

        System.out.print("Enter Maximum Marks for the subjects = ");
        int max = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject [" + (i + 1) + "] = ");
            a[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        float avg = ((float) sum / (n * max)) * 100;

        System.out.println();
        System.out.println("----STUDENT GRADE CARD----");
        System.out.println("Total Marks obtained = " + sum + "/"+n*max);
        System.out.println("Average of marks = " + avg);

        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade Scored by Student is " + grade);
        System.out.println();

        sc.close();
    }
}
