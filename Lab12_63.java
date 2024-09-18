public class Lab12_63 {
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
    void InsertAtlast(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
            return;
        }
        else
        {
            Node save = first;
            while(save.link != null){
                save = save.link;
            }
            save.link = newNode;
        }
    }
    void sortLinklist(){
        Node i = first;
        Node j;
        while (i.link!=null){
            j=i.link;
            while(j.link!=null){
                if(j.info<i.info){
                    int temp = j.info;
                    j.info = i.info;
                    i.info = temp;
                }
                j = j.link;
            }
            i = i.link;
        }
    }
    void copyLinklist(Lab12_63 l1){
        Node temp = l1.first;
        
    }
    void display()
    {
        Node save = first ;
        while(save != null){
            System.out.print(save.info + " ");
            save = save.link;
        }
    }
    public static void main(String args[]){
        Lab12_63 l1 = new Lab12_63();
        Lab12_63 l2 = new Lab12_63();
        l1.InsertAtlast(2);
        l1.InsertAtlast(5);
        l1.InsertAtlast(1);
        l1.InsertAtlast(4);
        l1.InsertAtlast(3);
        l1.InsertAtlast(6);
        l2.copyLinklist(l1);

        l1.display();
    }
}

