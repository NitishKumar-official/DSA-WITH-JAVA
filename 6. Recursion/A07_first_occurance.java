public class A07_first_occurance {

    public static int find_first_occurance(int arr[], int i,int key){

        if(i==arr.length -1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return find_first_occurance(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[]={2,3,5,6,4,5,3,9,8,7};
        int key = 12;

        System.out.println(find_first_occurance(arr, 0, key));
    }
    
}
