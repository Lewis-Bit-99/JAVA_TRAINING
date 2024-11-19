import java.util.Scanner;

public class myCar {

  private String carModel1,carModel2, carModel3;
  private int carDate1,carDate2,carDate3;
  private double carPrice1,carPrice2,carPrice3;
  Scanner SC = new Scanner(System.in);
  
  public myCar(){
      //constructor
    
      Scanner scanner = new Scanner(System.in); 
      System.out.println("Enter The First Car Model: ");
      this.carModel1 = scanner.nextLine();
      System.out.println("Enter The First Car Manufacturing Date: ");
      this.carDate1 = scanner.nextInt();
      System.out.println("Enter The First Car Price: ");
      this.carPrice1 = scanner.nextDouble();

      scanner.nextLine();
      System.out.println("car Model: "+ carModel1 + "Car Date:" + carDate1 + "Car Price:" + carPrice1);
      System.out.println("-------------------------------");

      System.out.println("Enter The Second Car Model: ");
      this.carModel2 = scanner.nextLine();
      System.out.println("Enter The 2nd Car Manufacturing Date: ");
      this.carDate2 = scanner.nextInt();
      System.out.println("Enter The 2nd Car Price: ");
      this.carPrice2 = scanner.nextDouble();

      scanner.nextLine();
      System.out.println("car Model:"+ carModel2 + "Car Date:" + carDate2 + "Car Price:" + carPrice2);
      System.out.println("-------------------------------");

      System.out.println("Enter The 3rd Car Model: ");
      this.carModel3 = scanner.nextLine();
      System.out.println("Enter The 3rd Car Manufacturing Date: ");
      this.carDate3 = scanner.nextInt();
      System.out.println("Enter The 3rd Car Price: ");
      this.carPrice3 = scanner.nextDouble();

      scanner.nextLine();
      System.out.println("car Model:"+ carModel3 + "Car Date:" + carDate3 + "Car Price:" + carPrice3);
      System.out.println("-------------------------------");


      Double AvgPrice = (carPrice1 + carPrice2 + carPrice3)/3;
      System.out.println("The Average Price Of 3 Cars is : " + AvgPrice);


    

  }
  static double AveragePrice(double carPrice1,double carPrice2,double carPrice3){

  
   Double AvgPrice = (carPrice1 + carPrice2 + carPrice3)/3;

   System.out.println("The Average Price Of 3 Cars is : " + AvgPrice);
      
   
   return AvgPrice;

   }
  
  

  public static void main(String[] args){
  
      myCar carObj = new myCar();
     

     carObj.AveragePrice();

         
        }
  
}