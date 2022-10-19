import java.io.*;
import java.util.Stack;

public class Main {
    // 10828
    static Stack<Integer> stack = new Stack<>();

    static void pushMethod(Integer number){
        stack.push(number);
    }

    static int popMethod(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.pop();
    }

    static int emptyMethod(){
        if(stack.isEmpty()){
            return 1;
        }
        return 0;
    }

    static int topMethod(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    private static void result(String[] list) {
        if(list[0].equals("empty")){
            System.out.println(emptyMethod());
        }else if(list[0].equals("size")){
            System.out.println(stack.size());
        }else if(list[0].equals("push")){
            pushMethod(Integer.parseInt(list[1]));
        }else if(list[0].equals("top")){
            System.out.println(topMethod());
        }else if(list[0].equals("pop")){
            System.out.println(popMethod());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++){
            String[] list = br.readLine().split(" ");
            result(list);
        }
    }
}
