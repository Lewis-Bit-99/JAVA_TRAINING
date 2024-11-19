import java.util.Scanner; // Import the Scanner class

public class AveragaPriceCar {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter The First Car Model: ");
        String carModel1 = scanner.nextLine();
        System.out.println("Enter The First Car Manufacturing Date: ");
        int carDate1 = scanner.nextInt();
        System.out.println("Enter The First Car Price: ");
        Double carPrice1 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("car Model: "+ carModel1 + "Car Date:" + carDate1 + "Car Price:" + carPrice1);
        System.out.println("-------------------------------");

        System.out.println("Enter The Second Car Model: ");
        String carModel2 = scanner.nextLine();
        System.out.println("Enter The 2nd Car Manufacturing Date: ");
        int carDate2 = scanner.nextInt();
        System.out.println("Enter The 2nd Car Price: ");
        Double carPrice2 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("car Model:"+ carModel2 + "Car Date:" + carDate2 + "Car Price:" + carPrice2);
        System.out.println("-------------------------------");

        System.out.println("Enter The 3rd Car Model: ");
        String carModel3 = scanner.nextLine();
        System.out.println("Enter The 3rd Car Manufacturing Date: ");
        int carDate3 = scanner.nextInt();
        System.out.println("Enter The 3rd Car Price: ");
        Double carPrice3 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("car Model:"+ carModel3 + "Car Date:" + carDate3 + "Car Price:" + carPrice3);
        System.out.println("-------------------------------");


        Double AvgPrice = (carPrice1 + carPrice2 + carPrice3)/3;
        System.out.println("The Average Price Of 3 Cars is : " + AvgPrice);



    }
    
}