public class carMatrix{


    public carMatrix(){



         String [][] matrix2 = {

            {"1", "Viva", "30000"},
            {"2", "Axia", "70000" },
            {"3", "Kancil", "110000"},
        };


        for (int row=0; row<matrix2.length; row++) {
            for (int col=0; col<matrix2[row].length; col++) {
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("=====================================");
        for (String matrixRow[] : matrix2) {
            for (String matrixCol: matrixRow) {


                System.out.print(matrixCol + " ");
            }
            
            System.out.println();
        }


    }

     public static void main(String[] args) {
         

        carMatrix cm = new carMatrix();

         

     }

    
}