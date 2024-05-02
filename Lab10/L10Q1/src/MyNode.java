public class MyNode {
    private Object data;
    private MyNode next;
    public MyNode(Object data,MyNode next){
        this.data = data; this.next = next;
    }

    public Object getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
