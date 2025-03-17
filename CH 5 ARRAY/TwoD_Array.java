class TwoDimensionalArray {  
    private int[][] array = {  
        {1, 2, 3},
        {4, 5, 6}
    };

    public void printArray() {
        System.out.println("Elements present in the array are:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class TwoD_Array {
    public static void main(String[] arg) {
        TwoDimensionalArray object = new TwoDimensionalArray();
        object.printArray();
    }
}
