
class Node{
  int data;
  Node next;
  public Node(){
    this.next = null;
    this.data = 0;
  }
  public Node(int data,Node next){
    this.next = next;
    this.data = data;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}


class Solution{
  
    public static Node rotateNode(Node head,int k,int n){
      if(head==null || head.next==null)
              return head;
          int size=0;
          Node curr = head;
          Node prev = null;
          while(curr!=null){
              curr=curr.next;
              size++;
          }
          curr =  head;
          k=k%size;
          while(k>0){
              while(curr.next!=null){
                  prev = curr;
                  curr = curr.next;
              }
              Node temp = curr;
            prev.next = null;
            temp.next = head;
            head = temp;
            k--;
        }
        return head;
    }
  }