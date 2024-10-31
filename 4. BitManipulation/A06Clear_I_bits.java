public class A06Clear_I_bits {

    public static int Clear_i_bits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        int n =15;
        int position = 2;
        System.out.println(Clear_i_bits(n, position));
    }
    
}
