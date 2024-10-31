// public class A05UpperCase {

//     public static void ConvertUpper(String str){
//         StringBuilder sb = new StringBuilder();
//         sb.append(Character.toUpperCase(str.charAt(0)));

//         for(int i =1; i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 sb.append((str.charAt(i)));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         System.out.println(sb);
//     }
//     public static void main(String[] args) {
//         String str = "i am nitish rana";
//         ConvertUpper(str);
//     }
    
// }


public class A05UpperCase {

    public static void convertUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args){
        String str = "i am nitish rana";
        convertUpperCase(str);
    }
}