import linklist;
import java.util.*;

class max_min_list extends linklist{

    static void min_max(linklist ll){
        node temp=ll.head;
        int min=temp.data,max=temp.data;
        for(int i=1 ;i<ll.size();i++){
            temp=temp.next;
            min=Math.min(temp.data,min);
            max=Math.max(temp.data,max);
        }
        System.out.println("Maximum element in list is "+min+ " and max element is "+max);
    }

    public static void main(String args[])
    {
        linklist ll=new linklist();
        ll.input();
        min_max(ll);
    }
}