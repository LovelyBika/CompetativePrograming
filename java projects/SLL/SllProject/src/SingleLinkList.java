public class SingleLinkList {
    public Node head;
    public Node tail;
    public int size; 
    public Node CreateSingleLinkList(int nodevalue){
        head= new Node();
        Node node=new Node();
        
        node.next=null;
        node.value=nodevalue;
        head=node;
        tail=node;
        size=1;
        return head;
}
//Method for Insertion in linked list
public void insertInLinkList(int nodevalue, int location){
    Node  node = new Node();
          node.value=nodevalue;
          if(head==null){
            CreateSingleLinkList(nodevalue);
            return;
          }
          if(location==0){
          node.next=head;
          head=node;
        }
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        } else {
            Node tempNode= new Node();
            tempNode=head;
            int index=0;
            if(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode =tempNode.next;
              tempNode.next=node;
              node.next=nextNode;

        }size++;

}
}
