class Node{
    int data;
    Node next;
    public Node(int data){
      this.next = null;
      this.data = data;
    }
    public Node(int data, Node next){
      this.next = next;
      this.data = data;
    }
    public Node(){
      this.data = 0;
      this.next = null;
    }
  }
  
  class Solution{
      public Node removeDuplicates(Node head){
Node a=head;
    int pos=0,val=0;
    int i=0;
    while(a!=null){
        if(a.data>=val)
        {
            val=a.data;
            pos=i;
        }
        i++;
        a=a.next;
    }
   
    int x=0;
    Node d=head;
      Node pre=null;
    while(x<pos){
        pre=d;
        d=d.next;
        x++;
        }
    
  
    if(x==0)
    {
        head=d.next;
       d.next=null;
    }
    else if(x>0&&x<i)
    {
        pre.next=d.next;
        d.next=null;
        
    }
     else
    head.next=null;
    
    return head;
    
  }
}