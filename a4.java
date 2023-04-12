import java.util.*;
class LinkedList
{
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
        
    public Node head = null;    
    public Node tail = null;    
        
        
    public void setNode(int data) {    
        
        Node newNode = new Node(data);    
            
        if(head == null) {      
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
    public void printData()
    {   Node t=head;
        if(head==null)
         System.out.println("List is empty");
         else
         {
                while(t!=null)
                {
                    System.out.print(t.data+" ");
                    t=t.next;
                }
         }
    }
    public void deleteData()
    {
        Node p=head;
        Node q;
        while(p.next!=null)
        {
        if(head.data>25)
        {
            head=head.next;
            p=head;
        }
        else{
            p=p.next;
            break;}
       }
        q=head;
        while(p!=null)
        {
            if(p.data>25)
            {
                q.next=p.next;
                p=p.next;
            }
            else
            {
                p=p.next;
                q=q.next;
            }
        }
       
    }
     
}
public class a4
{
	public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    list.setNode(46);
	    list.setNode(17);
	    list.setNode(30);
	    list.setNode(21);
        list.setNode(13);
        list.setNode(9);
        list.setNode(43);
        list.deleteData();
        list.printData();
	}
}
