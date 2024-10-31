public class A03Substring {

    public static String substring_gen(String str, int si, int ei){
        String subString = "";
        for(int i=si;i<ei; i++ ){
            subString +=str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args){
        String str = "HelloWorld";
        System.out.println(substring_gen(str, 3, 5));
        
    }
    
}
