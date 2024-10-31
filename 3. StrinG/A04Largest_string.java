public class A04Largest_string {

    public static void Largest_string(String str[]){
        String Largest = str[0];
        for(int i=0; i<str.length; i++){
            if(Largest.compareTo(str[i])<0){
                Largest = str[i];
            }
        }
        System.out.println(Largest);
    }
    public static void main(String [] args){
        String str[] = {"mango", "banana", "orange"};
        Largest_string(str);
    }
    
}



