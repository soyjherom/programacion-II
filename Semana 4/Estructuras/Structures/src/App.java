public class App {
    public static void main(String[] args) throws Exception {
        doubleNodes();
    }

    private static void doubleNodes(){
        DNode one = new DNode("B",
                    new DNode("A"), 
                    new DNode("C",
                        new DNode("D", 
                            new DNode("E"))));
        System.out.println(one.goForward(one));
        System.out.println(one.goBackwards(one));
    }

    private static void single(){
        Node firstNodo = new Node('H', 
            new Node('E', 
                new Node('L', 
                    new Node('L', 
                        new Node('O')))));
        firstNodo.getNext(firstNodo);
    }
}
