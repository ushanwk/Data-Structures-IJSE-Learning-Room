package lk.ijse.linkedlist;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Linked linked = new Linked();

        linked.insertAtBegining(10);
        linked.insertAtBegining(20);
        linked.insertAtBegining(30);
        linked.insertAtBegining(40);
        linked.insertAtBegining(50);
        linked.insertAtBegining(60);

        linked.transvers();

        System.out.println(linked.getFirstIndex(1));

    }

}
