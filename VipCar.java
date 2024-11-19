import java.util.Scanner;

public class VipCar{

int carModel;
static int CarPrice = 0;


public void Display()
{


    Scanner scanner = new Scanner(System.in);

    System.out.println("Please Choose Car Model\n 1 - Civic \n 2 - Viva  \n 3 - Kenari  \n 4 - Saga");
    System.out.println("Please Enter The Number, Dear Buyer");
    System.out.println("............................:)");
    int carModel = scanner.nextInt();

    System.out.println("//-----------Loading------------//");
    
    switch(carModel) {
       case 1:
         System.out.println("The Car Model is Civic");
         CarPrice = 150000;
         break;

       case 2:
         System.out.println("The Car Model is Viva");
         CarPrice = 45000;
         break;

       case 3:
         System.out.println("The Car Model is Kenari");
         CarPrice = 35000;
         break;

       case 4:
         System.out.println("The Car Model is Saga");
         CarPrice = 25000;
         break;

       default:
         System.out.println("Invalid Choice, Madam/Sir !! Pick 1 - 4 only");

       }

   System.out.println("Car Price Is :" + CarPrice + "Myr");
  
   if (CarPrice >= 50000) {
       
       System.out.println("You are a VIP");

   }else if(CarPrice == 0){
      
       System.out.println("AHH Poor Human!!");

   }else{

       System.out.println("You are a normal");
   }
}


  public static void main(String[] args){
     

    VipCar VP = new VipCar();
     
     VP.Display();
  }
}