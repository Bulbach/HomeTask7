package local;

import javax.management.ObjectName;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ListClass {

    private LinkedList<Integer> scroll;

    public LinkedList<Integer> getScroll(int length) {

        scroll = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                scroll.add(i);
            } else {
                scroll.addFirst(i);
            }
        }

        return scroll;
    }


    public LinkedList<Integer> deleteScroll() {

        Collections.sort(scroll);
        System.out.println(scroll);
        int i = 0;
        while (!scroll.isEmpty()) {
            if (i % 2 == 0) {
                System.out.println(scroll.pollLast() + "   Элемент с конца");
            } else {
                System.out.println(scroll.pollFirst() + "  Элемент из начала");
            }
            i++;
        }
        return scroll;
    }


}
