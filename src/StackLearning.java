import java.util.Scanner;
import java.util.Stack;

public class StackLearning {
    public static void main(String[] args) {
        System.out.println("Stack Learning");

        Stack<Integer> stack = new Stack<>();

        System.out.println("Hi User Please Enter the 5 value for Stack");
        for(int i=0;i<5;i++){
            Scanner sc= new Scanner(System.in);
            stack.push(sc.nextInt());
        }

        int n=stack.pop();
        System.out.println("Popped Value is "+n);

       int e = stack.peek();
       System.out.println("Peek Value is "+e);

        System.out.println(stack);
    }
}
