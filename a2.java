import java.util.*;
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
           
       
         public void addFirst(int d)
         {    Node newNode = new Node(d);
            
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                newNode.next=head;
                head=newNode;
            }
        
         }
         public void addLast(int d)
         {  Node newNode = new Node(d);
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                 tail.next=newNode;
                 newNode.next=null;
            }
         }   
         public void addAtIndex(int d,int i)
         {  Node newNode = new Node(d);
            Node current=head;
               if(i==1)
               {
                newNode.next=head;
                head=newNode;
               }
               else{
                while(i-2>0)
                {
                    current=current.next;
                    i--;
                }
                newNode.next=current.next;
                current.next=newNode;
            }

         }
         public void deleteFirst() {  
  
    
            if(head == null) {  
                System.out.println("List is empty");  
                return;  
            }  
            else {    
                if(head != tail) {  
                    head = head.next;  
                }  
                else {  
                    head = tail = null;  
                }  
            }  
        }  
        
            public void deleteLast() {  
  
             
                if(head == null) {  
                    System.out.println("List is empty");  
                    return;  
                }  
                else {  
                    
                    if(head != tail ) {  
                        Node current = head;  
 
                        while(current.next != tail) {  
                            current = current.next;  
                        }  
  
                        tail = current;  
                        tail.next = null;  
                    }  
              
                    else {  
                        head = tail = null;  
                    }  
                }  
            } 
            public void deleatAtIndex(int i)
            {
                int j=1;
                if(head==null)
                {
                    System.out.println("List is empty");  
                    return; 
                }
                else
                {
                    if(head==tail)
                    {
                        head = tail = null;
                    }
                    else
                    {  Node current =head;
                       Node p;
                       if(i!=1)
                    {
                       while(j<i-1)
                        {
                              current=current.next;
                              j++;
                        }
                            p=current.next;
                            current.next=p.next;
                    }
                    else
                    {
                       head=head.next;
                    }
                    }

                    
                }
            }   
         public void deleteOfData(int d)
         {   Node current2=head.next;
             Node current1=head;
            while(current2.data!=d)
            {
                  current1=current1.next;
                  current2=current2.next;
            }
             current1.next=current2.next;

        }
         public int traverse() {    
        int count = 0;    
           
        Node current = head;    
         
        while(current != null) {    
                
            count++;    
            current = current.next;    
        }    
        return count;    
    }
    public void display() {    
        
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
   
public class a2{
    public static void main(String[] args) {    
        LinkedList List = new LinkedList();    
        Scanner sc = new Scanner(System.in);
        int n,k,i;
        List.mNode(26);    
        List.mNode(19);
        List.mNode(2);
        List.mNode(8);   
        System.out.println("Enter a number for which type of operation do you want to do on LinkedList");
        System.out.println("1: Insert a Node at First");
        System.out.println("2: Insert a node at last");
        System.out.println("3: Insert a Node at given Index");
        System.out.println("4: Delete a First Node ");
        System.out.println("5: Delete a Last Node");
        System.out.println("6: Delete a Node of given Index");
        System.out.println("7: Delete a Node of given Data");
        System.out.println("8: To Traverse a Linked List");
        n=sc.nextInt();
        System.out.println("Linked List before changes");
        List.display();    
        
        switch(n)
        {
            case 1:
                  System.out.println("Enter a data of node");
                   k=sc.nextInt();
                   List.addFirst(k);
                   System.out.println("Linked List After changes");
                   List.display();
                 break;
            case 2: 
                    System.out.println("Enter a data of node");
                    k=sc.nextInt();
                    List.addLast(k);
                    System.out.println("Linked List After changes");
                    List.display();
                 break;
            case 3: 
                  System.out.println("Enter a data of node");
                  k=sc.nextInt();
                  System.out.println("At which index do you want to add node");
                  i=sc.nextInt();
                  List.addAtIndex(k,i);
                  System.out.println("Linked List After changes");
                  List.display();
                  break;
                 
            case 4: 
                 List.deleteFirst();
                 System.out.println("Linked List After changes");
                 List.display();
                 break;
            case 5: 
                 List.deleteLast();
                 System.out.println("Linked List After changes");
                 List.display();
                 break;
            case 6:   
                      System.out.println("At Which index do you want to delete Node?");
                      i=sc.nextInt();
                      List.deleatAtIndex(i);
                      System.out.println("Linked List After changes");
                      List.display();
                 break;
            case 7: 
                System.out.println("Enter a data whose node you want to delete.");
                k=sc.nextInt();
                List.deleteOfData(k);
                System.out.println("Linked List After changes");
                List.display();
                 break;
            case 8:
                  System.out.printf("LinkedList is ");
                  List.display();
                  System.out.println("Size of Linked List is "+List.traverse());
                  
                 break;

       }
   }   
  }
