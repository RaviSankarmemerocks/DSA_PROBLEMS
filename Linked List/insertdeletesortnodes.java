class LinkedList1{
    int val;
    LinkedList1 next;
    LinkedList1(int n){
        this.val=n;
        this.next=null;
    }
}
public class InsertingNodes {
    public static void main(String args[]){
        LinkedList1 ll=new LinkedList1(0);
        ll=sort(insertatend(9,ll));
        ll=sort(insertatend(9,ll));
        ll=sort(insertatend(9,ll));
        ll=sort(insertatend(9,ll));

        printlist(ll);
        System.out.println();
        ll=sort(deletenode(9,ll));
        //ll=sort(insertatend(1,ll));

        printlist(ll);

    }
    public static LinkedList1 deletenode(int n,LinkedList1 head){
        LinkedList1 temp=head;
        while(temp!=null){
            if(temp.next != null && temp.next.val == n) {
                temp.next = temp.next.next;
            }
            else {
               temp = temp.next;
            }
        }
        return head;
    }
    public static void printlist(LinkedList1 l ){
        while(l!=null){
            System.out.print(l.val+" ");
            l=l.next;
        }
    }
    public static LinkedList1 insertatbeginning(int n,LinkedList1 head){
        LinkedList1 temp=new LinkedList1(n);
        temp.next=head;
        return temp;
    }
    public static LinkedList1 insertatend(int n,LinkedList1 head){
        LinkedList1 temp=new LinkedList1(n);
        temp.next=null;
        LinkedList1 last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = temp;
        return head;
    }
    public static LinkedList1 sort(LinkedList1 l){
        LinkedList1 temp=l;
        while(temp!=null){
            LinkedList1 current=temp.next;
            while(current!=null){
                if(temp.val>current.val){
                    int t=temp.val;
                    temp.val=current.val;
                    current.val=t;
                }
                current=current.next;
            }
            temp=temp.next;
        }
        return l;
    }
}

