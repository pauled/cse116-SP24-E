package week5;

public class LinkedListNodeInt {
    private int value;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int value,LinkedListNodeInt next){
        this.value=value;
        this.next=next;
    }


    public String toString() {
        String out="";
        if (this.next!=null){
            out+=this.next.toString()+" ";
        }
        out+=this.value;
        return out;
    }
    public String toString2() {
        if (this.next==null){
            return ""+this.value;
        } else {
            return this.next.toString2()+" "+this.value;
        }
    }

    public static void main(String[] args) {
        LinkedListNodeInt first=new LinkedListNodeInt(1,null);
        first=new LinkedListNodeInt(2,first);
        first=new LinkedListNodeInt(3,first);
        String temp=first.toString();
        System.out.println(temp);
    }
}
