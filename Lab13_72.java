public class Lab13_72 {
    class Node
    {
        int info;
        Node rightlink;
        Node leftlink;
        Node(int info)
        {
            this.info=info;
            this.rightlink=null;
            this.leftlink=null;
        }
    }
    Node first=null;
    void InsertAtFirst(int info){
        Node newNode=new Node(info);
        if(first == null){
            first=newNode;
            return;
        }
        else
        {
            newNode.rightlink = first;
            first.leftlink = newNode;
            first = newNode;
        }
    }
    void Delete(int info){
        Node temp=first;
        Node prev=null;
        while(temp!=null && temp.info!=info){
            prev=temp;
            temp=temp.rightlink;
        }
        if(temp==null){
            System.out.println("Element not found");
            return;
        }
        if(prev==null){
            first=first.rightlink;
            if(first!=null){
                first.leftlink=null;
            }
        }
        else{
            prev.rightlink=temp.rightlink;
            if(temp.rightlink!=null){
                temp.rightlink.leftlink=prev;
            }
        }
        System.out.println("Element deleted: " + info);
    }
    void display(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.info + " ");
            temp=temp.rightlink;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Lab13_72 l=new Lab13_72();
        l.InsertAtFirst(1);
        l.InsertAtFirst(2);
        l.InsertAtFirst(3);
        System.out.println("Linked List is: ");
        l.display();
        l.Delete(2);
        l.display();
    }
}
