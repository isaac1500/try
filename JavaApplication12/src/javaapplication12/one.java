/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

public class one {  // Keeping original class name to match file name
    String studentName;
    int mathMarks;  // Fixed typo in variable name (was mathMarks)
    int englishMarks;
    int scienceMarks;

    public int calculateTotal() {
        return mathMarks + englishMarks + scienceMarks;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public String getGrade() {
        double average = calculateAverage();
        if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        one student = new one();  // Using class name 'one'

        System.out.print("Enter student name: ");
        student.studentName = scanner.nextLine();

        System.out.print("Enter Mathematics marks: ");
        student.mathMarks = scanner.nextInt();

        System.out.print("Enter English marks: ");
        student.englishMarks = scanner.nextInt();

        System.out.print("Enter Science marks: ");
        student.scienceMarks = scanner.nextInt();

        System.out.println("\n--- REPORT ---");
        System.out.println("Student: " + student.studentName);
        System.out.println("Total Marks: " + student.calculateTotal());
        System.out.printf("Average: %.2f\n", student.calculateAverage());
        System.out.println("Grade: " + student.getGrade());
        
        scanner.close();
    }
}