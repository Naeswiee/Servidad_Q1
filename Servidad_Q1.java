import java.util.Scanner;

class StudentEnrollment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input student information
        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();
        
        System.out.print("Enter Course: ");
        String course = input.nextLine();
        
        System.out.print("Enter Course Code: ");
        String courseCode = input.nextLine();
        
        int totalUnits = 0;
        while (true) {
            System.out.print("Enter Number of Units (maximum 10): ");
            totalUnits = input.nextInt();
            if (totalUnits > 0 && totalUnits <= 10) {
                break;
            } else {
                System.out.println("Invalid number of units. Please enter between 1 and 10.");
            }
            
        }
        // Calculate total fee
        int feePerUnit = 1000;
        int totalFee = totalUnits * feePerUnit;
        System.out.println("Total Enrollment Fee: $" + totalFee);
        // Handle payment
        System.out.print("\nEnter Payment Amount: ");
        int payment = input.nextInt();

         // Output student name and total enrollment fee
        System.out.println("\n--- Enrollment Details ---\n");
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Total Enrollment Fee: $" + totalFee);
        
        if (payment == totalFee) {
            System.out.println("Fully Paid");
        } else if (payment < totalFee) {
            int remainingBalance = totalFee - payment;
            System.out.println("Partial Payment: $" + payment);
            System.out.println("Remaining Balance: $" + remainingBalance);
        } else {
            int excessPayment = payment - totalFee;
            System.out.println("Overpaid by: $" + excessPayment);
        }

        input.close();
    }
}
