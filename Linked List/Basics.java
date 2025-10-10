package patterns;

public class hello{
    public static class Node{
        int data ;
        Node next;


        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        Node head;
        Node tail;

    public void addfirst(int data){
        // create a node 
        Node newNode =  new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void addlast(int data ){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "-->");
        }

        System.out.println("null");
    }

    public static void main(String args[]){
        hello list = new hello();

        list.addlast(9);
        list.addfirst(3);
        list.addfirst(7);
        list.addlast(10);


        list.print();
    }
}
