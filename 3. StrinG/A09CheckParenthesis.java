import java.util.Scanner;
import java.util.Stack;

public class A09CheckParenthesis {

    public static boolean CheckParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                return false;
                char top = stack.peek();
                if(c==')'&& top=='(' || c=='}'&& top=='{' || c==']'&& top=='[')
                stack.pop();
                else
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of parenthesis");

        String str = sc.nextLine();

        if(CheckParenthesis(str)){
            System.out.println("IT is valid Parenthesis");
        }
        else{
            System.out.println("It is not valid parenthesis");
        }
    }
    
}
