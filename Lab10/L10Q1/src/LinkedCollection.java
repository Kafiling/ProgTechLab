public class LinkedCollection implements Collection {
    private MyNode first;
    private int size;
    public LinkedCollection(){
        first = null;
        size = 0;
    }
    @Override
    public void add(Object obj) {
        first = new MyNode(obj,first);
        size++;
        System.out.println(obj + " Added to list");
    }

    @Override
    public void remove(Object obj) {
        if (!this.isEmpty()) {
            MyNode pre = null;
            MyNode pointer = first;
            while(pointer.getNext() != null && !(pointer.getData().equals(obj))){
                pre = pointer;
                pointer = pointer.getNext();
            }
            if(pointer.getData().equals(obj)){
                if(first == pointer){
                    first = first.getNext();
                    size--;
                    System.out.println(obj + " Removed from list");
                }
                else{
                pre.setNext(pointer.getNext());
                size--;
                System.out.println(obj + " Removed from list");
                }
            }
            else{
                System.out.println("Not Found");
            }
        }

    }

    @Override
    public Boolean contain(Object obj) {
        MyNode pointer= first;
        while(pointer != null){
            if(pointer.getData().equals(obj)){
                return true;
            }
            pointer = pointer.getNext();
        }
        return false;
    }

    @Override
    public Boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }}
