public class Test1 {
    public static void main(String[] args) {
        LinkedCollection list = new LinkedCollection();
        Integer a=20,b=30,c=50;
        list.add(a);
        list.add(b);
        list.add(c);
        list.remove(a);
        list.remove(c);
        if(list.contain(b)){
            System.out.println(b+" Found in list!");
        }
        else{
            System.out.println(b+" Not Found");
        }

    }
}
