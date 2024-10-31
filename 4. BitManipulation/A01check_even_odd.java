

public class A01check_even_odd {
    public static void main(String[] args) {
        int num = 3;
        int bitmask = 1;
        if((num & bitmask)==1){
            System.out.println(num+" is odd");
        }
        else{
            System.out.println(num+" is even");
        }
    }
    
}


// lsb of a number is 1 then that number is odd if it is 0 then number is even