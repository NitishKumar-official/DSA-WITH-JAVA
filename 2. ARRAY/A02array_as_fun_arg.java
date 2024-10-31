public class A02array_as_fun_arg {

    public static void update(int arr[]){
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=arr[i]+1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,56,53,48,6};
        update(arr);
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}
