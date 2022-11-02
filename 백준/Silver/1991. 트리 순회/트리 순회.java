import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static HashSet<String> visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tree tree = new Tree();
        visited = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String[] str = br.readLine().split(" ");
            Node node = new Node(str[0], str[1], str[2]);
            tree.putNode(node);
        }

        tree.preOrder("A");
        System.out.println();
        tree.inOrder("A");
        System.out.println();
        tree.postOrder("A");
    }


    static class Tree {
        Map<String, Node> nodes = new HashMap<>();

        public void putNode(Node node){
            nodes.put(node.ME, node);
        }

        void preOrder(String nodeName) {
            Node node = nodes.get(nodeName);
            System.out.print(node.ME);
            if(node.LEFT != null){
                preOrder(node.LEFT);
            }
            if(node.RIGHT != null){
                preOrder(node.RIGHT);
            }
        }

        void inOrder(String nodeName) {
            Node node = nodes.get(nodeName);
            if(node.LEFT != null){
                inOrder(node.LEFT);
            }
            System.out.print(node.ME);
            if(node.RIGHT != null){
                inOrder(node.RIGHT);
            }
        }

        void postOrder(String nodeName) {
            Node node = nodes.get(nodeName);
            if(node.LEFT != null){
                postOrder(node.LEFT);
            }
            if(node.RIGHT != null){
                postOrder(node.RIGHT);
            }
            System.out.print(node.ME);
        }
    }

    static class Node{
        String ME = null;
        String LEFT = null;
        String RIGHT = null;

        public Node(String me, String left, String right) {
            this.ME = me;
            if(!left.equals(".")){
                this.LEFT = left;
            }
            if(!right.equals(".")){
                this.RIGHT = right;
            }
        }
    }
}
