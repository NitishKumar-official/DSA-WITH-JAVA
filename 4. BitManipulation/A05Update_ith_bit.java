public class A05Update_ith_bit {


    public static int ClearIthBit(int n, int i){
        int maskbit = ~(1<<i);
        return n & maskbit;

    }

    public static int SetIthBit(int n, int i){
        int maskbit = 1<<i;
        return n | maskbit;

    }

    public static int UpdateIthBit(int n, int i, int newBit){
  
        if(newBit==0){
            return ClearIthBit(n, i);
        }
        else{
            return SetIthBit(n, i);
        }

    }

    public static void main(String[] args){
        int num = 10;
        int position = 2;
        int newBit = 1;
        System.out.println(UpdateIthBit(num, position,newBit));

    }
}
