public class DNode {
    private DNode after;
    private String value;
    private DNode before;
    public DNode(final String value){
        this.value = value;
    }
    public DNode(final String value, 
                final DNode after){
        this.value = value;
        this.after = after;
    }
    public DNode(final String value,
                final DNode before,
                final DNode after){
        this.value = value;
        this.before = before;
        this.after = after;
    }
    public void setBefore(final DNode node){
        this.before = node;
    }
    public String getValue(){return this.value;}
    public String goForward(final DNode node){
        if(node.after != null){
            return node.value + this.goForward(node.after);
        }else{
            return node.value;
        }
    }
    public String goBackwards(final DNode node){
        if(node.before != null){
            return this.goBackwards(node.before) + node.value;
        }else{
            return node.value;
        }
    }
}
