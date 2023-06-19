class Main{
   

    public static void main(String[] args) {
        SingleLinkList sll= new SingleLinkList();
        sll.CreateSingleLinkList(5);
        System.out.println(sll.head.value);
        sll.insertInLinkList(23, 1);
        sll.insertInLinkList(20, 2);
        System.out.println(sll.head.next.value);
        System.out.println(sll.head.next.next.value);
    }
}
    