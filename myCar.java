
public class myCar {

  private String carModel;
  private int carMake;
  private double carPrice;
  
  
  public myCar(String carModel, int carMake, double carPrice){
      //constructor
  
    this.carModel = carModel;

    this.carMake = carMake;
    this.carPrice = carPrice;
  
  }
  
  
  public static void main(String[] args){
  
      myCar carObj = new myCar("Saga",2010,51234.56);
      

          System.out.println("Car Model :" + carObj.carModel);
          System.out.println("Manufacturing date :" + carObj.carMake);
          System.out.println("Car Price :" + carObj.carPrice);
     

  
        }
  
}