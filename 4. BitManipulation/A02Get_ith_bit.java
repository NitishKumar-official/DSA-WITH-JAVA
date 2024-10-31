public class A02Get_ith_bit {

    public static int getIthBit(int n, int i){
        int maskbit = 1<<i;
        if((n & maskbit) ==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args){
        int num = 16;
        int position = 2;
        System.out.println(getIthBit(num, position));

    }
    
}
