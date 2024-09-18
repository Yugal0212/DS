public class Lab12_65 {
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
    void display()
    {
        Node save = first ;
        while(save != null){
            System.out.print(save.info + " ");
            save = save.link;
        }
    }
    public static void main(String args[]){
        Lab12_65 l = new Lab12_65();
        l.InsertAtlast(2);
        l.InsertAtlast(5);
        l.InsertAtlast(1);
        l.InsertAtlast(4);
        l.InsertAtlast(3);
        l.InsertAtlast(6);
        l.sortLinklist();
        l.display();
        // Output: 1 2 3 4 5 6
    }
}