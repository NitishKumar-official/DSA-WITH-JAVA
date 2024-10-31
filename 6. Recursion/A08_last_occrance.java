// public class A08_last_occrance {

//     public static int find_last_occurance(int arr[], int i,int key){

//         if(i==0){
//             return -1;
//         }

//         if(arr[i]==key){
//             return i;
//         }

//         return find_last_occurance(arr, i-1, key);
//     }

//     public static void main(String[] args) {
//         int arr[]={2,3,5,6,4,5,3,9,8,7};
//         int key = 8;

//         System.out.println(find_last_occurance(arr, arr.length-1, key));
//     }
    
// }



public class A08_last_occrance {

    public static int find_last_occurance(int arr[], int i,int key){

        if(i==arr.length-1){
            return -1;
        }

       int isFound = find_last_occurance(arr, i+1, key);

        if(isFound ==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[]={2,3,5,6,4,5,3,9,8,7};
        int key = 8;

        System.out.println(find_last_occurance(arr, 0, key));
    }
    
}
