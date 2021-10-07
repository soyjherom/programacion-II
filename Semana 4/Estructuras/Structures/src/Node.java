public class Node {
    private Node next;
    private char value;
    public Node(final char value){
        this.value = value;
        int c = Utilities.suma(1, 1);
    }
    public Node(final char value, final Node node){
        this.value = value;
        this.next = node;
    }
    public char getValue(){return this.value;}
    public void getNext(final Node node){
        System.out.print(node.getValue());
        if(node.next != null){
            this.getNext(node.next);
        }
    }
}
