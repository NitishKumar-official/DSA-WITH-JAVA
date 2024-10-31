

public class A03Search_in_sorted_matrix {

    public static boolean Search_sorted_matrix(int arr[][], int key){
        int row = 0, col = arr[0].length-1;
        while(row <arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("key is found at:("+row+" "+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println(key+"not found in the matrix");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        Search_sorted_matrix(arr, 13);
    }
    
}
