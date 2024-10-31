public class A03Set_ith_bit {

    public static int SetIthBit(int n, int i){
        int maskbit = 1<<i;
        return n | maskbit;

    }

    public static void main(String[] args){
        int num = 10;
        int position = 2;
        System.out.println(SetIthBit(num, position));

    }
    
}
