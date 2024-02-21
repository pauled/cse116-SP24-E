package week5;

public class LLNode<T> {
    private T value;
    private LLNode next;

    public LLNode(T value,LLNode next){
        this.next=next;
        this.value=value;
    }
    public T getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        String out="";
        out+=this.value;
        if(this.next!=null){
            out+=this.next.toString();
        }
        return out;
    }
    public int size(){
        if (this.next==null){
            return 1;
        }
        int temp= 1+this.next.size();
        return temp;
    }

    public void append(T element){
        if (this.next==null){
            this.next=new LLNode(element,null);
        } else {
            this.next.append(element);
        }
    }
    //public LLNode find(T element){}
    public void insert(T element,int loc){
        if (loc==1){
            this.next=new LLNode(element,this.next);
        } else {
            this.next.insert(element,loc-1);
        }
    }


    public static void main(String[] args) {
        LLNode<Integer> first=new LLNode<>(1,null);
        first=new LLNode<>(2,first);
        first=new LLNode<>(3,first);
        String temp=first.toString();
        System.out.println(temp);
        int temp2=first.size();
        System.out.println(temp2);
    }
}
