import java.util.Scanner;

public class myCar {

  private String carModel, carModel2, carModel3;
  private int carMake1,carMake2,carMake3;
  private double carPrice1,carPrice2,carPrice3;
  
  
  public myCar(String carModel, int carMake, double carPrice){
      //constructor
  
    this.carModel = carModel;

    this.carMake = carMake;
    this.carPrice = carPrice;
  
  }
  
  public void Calculation() {
    
  }
  
  public static void main(String[] args){
  
      myCar carObj = new myCar("Saga",2010,51234.56);
      

          System.out.println("Car Model :" + carObj.carModel);
          System.out.println("Manufacturing date :" + carObj.carMake);
          System.out.println("Car Price :" + carObj.carPrice);


          Scanner myObj = new Scanner(System.in);  // Create a Scanner object
          System.out.println("Enter username");

          String userName = myObj.nextLine();  // Read user input
          System.out.println("Username is: " + userName);  // 
          carObj.Calculation();

  
        }
  
}