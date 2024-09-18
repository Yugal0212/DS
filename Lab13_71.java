public class Lab13_71 {
    class Node
    {
        int info;
        Node link;
        Node(int info)
        {
            this.info=info;
            this.link=null;
        }
    }
    Node first=null;
    Node last = null;
    void InsertAtFirst(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
            last = newNode;
            first.link = first;
            return;
        }
        else
        {   
            
            newNode.link = first;
            first = newNode;
            last.link = first;

        }
    }
    void InsertAtlast(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
            last = newNode;
            first.link = first;
            return;
        }
        else
        {
            last.link = newNode;
            last = newNode;
            last.link = first;
        }
    }
    void Delete(int info){
        if(first==null){
            System.out.println("LinkedList Underflow");
            return;
        }
        else{
            if(first.info == info && first == last){
                first = null;
                last = null;
            }
            else if(first.info == info){
                first = first.link;
                last.link = first;
            }
            else{
                Node save = first;
                Node pre = null;
                while(save!= last && save.info!=info){
                    pre = save;
                    save = save.link;
                }
                pre.link = save.link;
            }
        }
            
        
    }
    void display()
    {
        Node save = first ;
        while(save != last){
            System.out.print(save.info + " ");
            save = save.link;
        }
        System.out.print(save.info + " "); // last node
    } 
    public static void main(String[] args) {
        Lab13_71 l = new Lab13_71();
        l.InsertAtFirst(1);
        l.InsertAtFirst(2);
        l.InsertAtFirst(3);
        l.InsertAtFirst(4);
        l.InsertAtlast(0);
        l.display(); // Output: 4 3 2 1 
        l.Delete(3);
        System.out.println();
        l.display(); //output : 4 2 1
    }   
}
