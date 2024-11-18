public class myCar {


  private String carModel;
  private int carMake;
  private double carPrice;
  private double AverageCar;
  
  public myCar(String carModel, int carMake, double carPrice){
      //constructor
  
    this.carModel = carModel;
    this.carMake = carMake;
    this.carPrice = carPrice;
  
  }
  
  public void Calculation() {
    double Saga = 16.44;
    double Porsche = 578.61;
    double Civic = 50.43;
    double CarAVG = (Saga + Porsche + Civic) / 3;
    
    System.out.println("The Average Price of 3 Cars :" + CarAVG + "k");
  }
  
  public static void main(String[] args){
  
      myCar carObj = new myCar("Saga",2010,51234.56);
      

          System.out.println("Car Model :" + carObj.carModel);
          System.out.println("Manufacturing date :" + carObj.carMake);
          System.out.println("Car Price :" + carObj.carPrice);

       carObj.Calculation();

  
        }
  
}