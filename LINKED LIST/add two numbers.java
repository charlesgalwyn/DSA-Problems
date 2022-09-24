
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Solution{
    public Node addTwoLinkedList(Node l1,Node l2){
      //write your code here.
      Node dummy = new Node(0);
      Node temp = dummy;
          int sum=0;
          int carry=0;
          while(l1!=null || l2!=null || carry==1){
              sum=0;
              if(l1!=null){
                  sum+=l1.data;
                  l1 = l1.next;
              }
              if(l2!=null){
                  sum+=l2.data;
                  l2 = l2.next;
              }
              sum+=carry;
              carry = sum/10;
              Node node = new Node(sum%10);
              temp.next = node;
              temp = temp.next;
          }
          return dummy.next;
      }
    }
