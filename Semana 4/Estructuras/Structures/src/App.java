public class App {
    public static void main(String[] args) throws Exception {
        Node firstNodo = new Node('H', 
            new Node('E', 
                new Node('L', 
                    new Node('L', 
                        new Node('O')))));
        // firstNodo.getNext(firstNodo);
        DNode one = new DNode("B",
                    new DNode("A"), 
                    new DNode("C",
                        new DNode("D", 
                            new DNode("E"))));
        System.out.println(one.goForward(one));
        System.out.println(one.goBackwards(one));
    }
}
