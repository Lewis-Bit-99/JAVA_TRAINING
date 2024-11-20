public class carMatrix{


    String [][] carModel = {

        {"Proton", "Viva", "Myvi"},
        {"Saga", "Axia", "Almera" },
        {"Kenari", "Kancil", "Vios"},
    };

     int [][] carPrice = {

        {55000 ,10000, 15000},
        {2000, 4000 ,60000},
        {6000, 12000, 24000},
    };


    public carMatrix(){


        System.out.println("3x3 Car Model Lists :");
        for (int row=0; row<carModel.length; row++) {
            for (int col=0; col<carModel[row].length; col++) {
                System.out.print(carModel[row][col] + " ");
            }
           System.out.println();
        }
       
        System.out.println("\n=====================================");

        System.out.println("3x3 Car Price Lists :");
        for (int matrixRow[] : carPrice) {
            for (int matrixCol: matrixRow) {

                System.out.print(matrixCol + " ");

            }
            System.out.println();
        }
     
        System.out.println("\n====================================="); 

        for (int row = 0; row < carPrice.length; row++) { 
            for (int col = 0; col < carPrice[row].length; col++) { 
                if (carPrice[row][col] > 50000) { 
                    System.out.println("Model: " + carModel[row][col] + ", Price: " + carPrice[row][col]); 
                } 
            } 
        }
               

    }

        
     public static void main(String[] args) {
         

       new carMatrix();

         

      }

}



