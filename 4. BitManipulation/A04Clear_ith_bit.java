public class A04Clear_ith_bit {

    public static int ClearIthBit(int n, int i){
        int maskbit = ~(1<<i);
        return n & maskbit;

    }

    public static void main(String[] args){
        int num = 10;
        int position = 1;
        System.out.println(ClearIthBit(num, position));

    }
    
    
}
