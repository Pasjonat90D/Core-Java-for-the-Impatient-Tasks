package com.task.chapter2.task17;


public class Queue {

    public class Node{
        private String item;
        private Node next;

        public Node(String item){
            this.item = item;
            this.next = null;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Node getNext(){
            return next;
        }
        @Override
        public String toString(){
            return item;
        }
    }

    public class Iterator{
        private Node node;

        private Iterator(){
            node = first;
        }

        public Node next(){
            Node result = node;
            node = node.getNext();
            return result;
        }
        public boolean hasNext(){
           return node!=null;
        }
    }


    private Node first;
    private Node last;

    public void add(String s){
        Node fresh = new Node(s);
        if(first==null){
            first = fresh;
            last = fresh;
        } else{
            Node temp = last;
            temp.setNext(fresh);
            last = fresh;
        }
    }

    public void remove(){
        if(first == last){
            first = null;
            last = null;
        } else{
        first = first.getNext();
    }
}
    @Override
    public String toString(){
        String result = "";
        for(Node temp=first;temp!=last;temp = temp.getNext()){
            result = result + temp;
        }
        return result;
    }

    public Iterator iterator(){
        return new Iterator();
    }

}
