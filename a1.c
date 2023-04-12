#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node *next;
    
};
struct Node *insertStart(struct Node *head,int d)
{
    struct Node *first=(struct Node *)malloc(sizeof(struct Node));
    first->next=head;
    first->data=d;

    return first;
}
struct Node *insertLast(struct Node *head,int d)
{
    struct Node *last=(struct Node *)malloc(sizeof(struct Node));
    struct Node *p=head;
    while(1)
    {   p=p->next;
        if(p->next==NULL)
        {
          p->next=last;
          last->next=NULL;
          break;
        }
    }
    last->data=d;
    return head;
}
struct Node *insertInbetween(struct Node *head,int d,int i)
{   int a=0;
    struct Node *p=head;
    struct Node *between=(struct Node *)malloc(sizeof(struct Node));
    while(a!=i-1)
    {
        p=p->next;
        a++;
    }
    between->next=p->next;
    between->data=d;
    p->next=between;
    return head;
}
struct Node *insertAfterNode(struct Node *head,struct Node *before,int d)
{ 
    struct Node *between=(struct Node *)malloc(sizeof(struct Node));
    between->data=d;
    between->next=before->next;
    before->next=between;
    return head;
}
struct Node *deleteFirst(struct Node *head)
{   struct Node *p=head;
    head=head->next;
    free(p);
    return head;
}
struct Node *deleteLast(struct Node *head)
{
    struct Node *d=head;
    struct Node *k=head->next;
    while(k->next!=NULL)
    {   d=d->next;
        k=k->next;
    }
    d->next=NULL;
    free(k);
    return head;
}
struct Node *deleteIndex(struct Node *head,int i)
{    int j=0;
    struct Node *d=head;
    struct Node *k=head->next;
    while(j<i-1)
    {
     d=d->next;  
     k=k->next;
     j++;
    }
    d->next=k->next;
    free(k);
    return head;
}
struct Node *deleteFixnode(struct Node *head,int d)
{
    struct Node *p=head;
    struct Node *q=head->next;
    while(q->next!=NULL&&q->data!=d)
    {
        p=p->next;
        q=q->next;
    }
    p->next=q->next;
    free(q);
    return head;
    
}
void traverse(struct Node *e1)
{   int count=0;
     while(e1!=NULL)
    {
    printf("%d\t",e1->data);
    e1=e1->next;
    count++;
    }
    printf("\n");
    printf("Total Nodes in Linkedlist is %d",count);
}
void printData(struct Node *e1)
{    
    while(e1!=NULL)
    {
    printf("%d\t",e1->data);
    e1=e1->next;
    }
}

int main()
{  int n,k,j,i;
   struct Node *head;
   struct Node *second;
   struct Node *third;
   struct Node *fourth;
   head=(struct Node*)malloc(sizeof(struct Node));
   second=(struct Node*)malloc(sizeof(struct Node));
   third=(struct Node*)malloc(sizeof(struct Node));
   fourth=(struct Node*)malloc(sizeof(struct Node));
   head->data=26;
   head->next=second;
   second->data=8;
   second->next=third;
   third->data=19;
   third->next=fourth;
   fourth->data=2;
   fourth->next=NULL;
  printf("Which operation do you want to do on LinkedsList?");
  printf("1:Insert at Starting\n");
  printf("2:Insert at End\n");
  printf("3:Insert in Between\n");
  printf("4:Insert after a Node\n");
  printf("5:Delete the first node.\n");
  printf("6:Delete the last node.\n");
  printf("7:Delete a node of given index\n");
  printf("8:Delete a node which has given value\n");
  printf("9:To traverse String");
  scanf("%d",&n);
  printf("Linked list\n");
   printData(head);
   printf("\n");
   switch(n)
   {
       case 1:printf("Enetre a data which you want to add\n");
              scanf("%d",&k);
              head=insertStart(head,k);
              printData(head);
              break;
       case 2:printf("Enetre a data which you want to add\n");
              scanf("%d",&k);
              head=insertLast(head,k);
              printData(head);
              break;
       case 3:printf("Enetre a data which you want to add\n");
              scanf("%d",&k);
              printf("At which index do you want to add a Node\n");
              scanf("%d",&j);
              head=insertInbetween(head,k,j);
              printData(head);
              break;
       case 4:printf("Enetre a data which you want to add\n");
              scanf("%d",&k);
              printf("After which node do you want to add a node?\n");
              head=insertAfterNode(head,second,k);
              printData(head);
       case 5:head=deleteFirst(head);
             printData(head);
             break;
       case 6:head=deleteLast(head);
             printData(head);
             break;
      case 7:printf("Which node do you want to delete?");
             scanf("%d",&i);
            head=deleteIndex(head,i);
             printData(head);
             break;
      case 8:printf("Which value do you want to delete?");
             scanf("%d",&i);
             head=deleteFixnode(head,i);
             printData(head);
             break;
      case 9:
             traverse(head);
             break;
   }
   
    return 0;
}
