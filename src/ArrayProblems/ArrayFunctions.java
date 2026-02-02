package ArrayProblems;

public class ArrayFunctions {

    public static void printAllElementsOfAnArray(int[][] arr){
        int[][] block = arr;

        for(int i=0; i<block.length;i++){
            System.out.println();
            for(int j=0;j<block[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");

            }
        }
    }

    public static void printFirstAndLastRowOfAnArray(int[][] arr){
        int[][] block = arr;

        for(int i=0; i < block.length; i++){
            for(int j =0; j < block[i].length; j++ ){
                    if(i == 0 || i == block.length-1){
                        System.out.print(block[i][j]);
                    }
            }
            System.out.println();
        }

    }

}
