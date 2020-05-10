package test;


import org.junit.Test;

public class listtest {

    private int count = 0;

    class node{
        public int data;
        public node(int data){this.data = data; this.next = null;}
        node next;
    }

    private node res = null;

    @Test
    public void run(){
        node n1 = new node(4);
        node n2 = new node(5);
        n2.next = new node(6);
        n2.next.next = new node(7);
        node temp1 = n1;
        node temp2 = n2.next.next;
        for (int i = 0; i < 1; i ++){
            node n = new node(i);
            temp1.next = n;
            temp2.next = n;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        getRes(n1,n2);
        System.out.println(res.data);
    }

    public node getRes(node n1, node n2){
        boolean flag;
        if (n1 == null)
            flag = true;
        else
            flag = false;
        node temp1 = null,temp2 = null;
        if (n1 != null) {
            temp1 =  getRes(n1.next, n2);
            if (res != null)
                return res;
        }
        if (flag && n2 != null) {
            temp2 =  getRes(n1, n2.next);
            if (res != null)
                return res;
        }
        if (flag == false && n1 != null){
            if (count == 0)
                temp1.next = null;
            else if (temp1.next != n1)
                res = temp1;
            count ++;
        }else{
            if (temp2 != null)
                temp2.next = n2;
        }
        return flag == true ? n2 : n1;
    }

}
