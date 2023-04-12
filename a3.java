class LinkedList{    
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
        
        
    public void mNode(int data) {    
        
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
    public void deleteOfData(int d)
         {   Node q=head.next;
             Node p=head;
            while(q.data!=d)
            {
                  p=p.next;
                  q=q.next;
            }
             p.next=q.next;
             printData();

        }
        public void printData() {    
        
            Node current = head;    
            if(head == null) {    
                System.out.println("List is empty");    
                return;    
            }    
            while(current != null) {    
                System.out.print(current.data + " ");    
                current = current.next;    
            }    
            System.out.println();    
        }    
}       
public class a3{
    public static void main(String[] args) {    
        LinkedList List = new LinkedList();    

        
        List.mNode(1);  
        List.mNode(5);
        List.mNode(7);
        List.mNode(3);
        List.mNode(8);
        List.mNode(2);
        List.mNode(3);
        System.out.println("Linked List Before changes");
          
        List.printData();
        System.out.println("Linked List After changes");                   
        List.deleteOfData(7);
                
            


          
    }
}

