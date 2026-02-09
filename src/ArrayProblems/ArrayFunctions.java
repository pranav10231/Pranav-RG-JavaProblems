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

    public static void printTheBorderElementsOfTheSquare(int[][] arr){
        int[][] square = arr;

        for(int i=0; i < square.length; i++){
            for (int j=0; j<square.length; j++){
                if(i == 1 && j==1){
                    System.out.print(" ");
                } else {
                    System.out.print(square[i][j]);
                }
            }
            System.out.println();
        }

    }

    public static void printTheDiagonalElementsOfTheSquare(int[][] arr){
        int[][] square = arr;

        for(int i=0; i < square.length; i++){
            for (int j=0; j<square.length; j++){
                if(i==j || i+j==square.length-1){
                    System.out.print(square[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printTheMajorDiagonalElementsOfTheSquare(int[][] arr1){
        int[][] arr = arr1;

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                if(row >= col ){
                    System.out.print(arr[row][col]);
                }
            }
            System.out.println();
        }
    }

    public static void printAllTheElementsAboveTheSquare(int[][] square){
        int[][] arr = square;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                if (row <= col){
                    System.out.print(arr[row][col]);
                }

            }
            System.out.println();
        }
    }

    public static void printAllTheEvenElementsOfAnArray(int[][] square){
        int[][] arr = square;

        for(int row=0; row<arr.length; row++){
            for(int col =0; col< arr.length; col++){
                if (arr[row][col] % 2 == 0){
                    System.out.print(arr[row][col]+ " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
