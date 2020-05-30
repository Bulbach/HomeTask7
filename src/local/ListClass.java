package local;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListClass {

    private LinkedList<Integer> scroll;
    private ArrayList<Integer> jenga;

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

    public ArrayList<Integer> getJenga(int length) {
        jenga = new ArrayList<>();
        for(int i =0;i <= length; i++ ){

            jenga.add(i);}

        return jenga;
    }

    public void playJenga(){

        for (int i=0;i< jenga.size();i++){
            int currentIndex = (int) (Math.random()*(jenga.size()-2)+1);
            jenga.add(jenga.remove(currentIndex));
            System.out.println(jenga+ "Этап: " + i);
        }
        System.out.println(jenga);
    }

}
