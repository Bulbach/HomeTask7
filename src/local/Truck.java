package local;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Truck {

    private final int MAX_WEIGHT;
    private final TreeSet<Cargo> CARGOS;


    public Truck(int maxWeight, TreeSet<Cargo> cargos) {
        MAX_WEIGHT = maxWeight;
        CARGOS = cargos;
    }

    public int sumWeight() {
        int sumWeight = 0;
        for (Cargo item : CARGOS) {
            sumWeight += item.getMASS();
        }
        return sumWeight;
    }

    public int overLoad() {

        return sumWeight() > MAX_WEIGHT ? sumWeight() - MAX_WEIGHT : 0;
    }

    public void loading() {
        while (overLoad() > 0) {
            Cargo over = new Cargo(overLoad());
            Cargo item = CARGOS.higher(over);
            if (item != null) {
                CARGOS.remove(item);

            } else {
                item = CARGOS.pollLast();
            }
            System.out.println("Удален" + item);
            overLoad();
        }
        System.out.println("Погрузка завершена. Машина может ехать. Масса груза = "+ sumWeight());
    }
    public void unLoading(){
       while (!CARGOS.isEmpty()){
           System.out.println("Удален груз" + CARGOS.pollFirst());
       }
        System.out.println("Машина выгружена");
    }

    public static class Cargo implements Comparable<Cargo> {
        private final int MASS;

        public Cargo(int max) {
            MASS = max;
        }

        public int getMASS() {
            return MASS;
        }

        @Override
        public int compareTo(Cargo o) {
            if (this.MASS < o.getMASS()) {
                return -1;
            } else if (this.MASS == o.getMASS()) {
                return 0;
            } else {
                return 1;
            }

        }

        @Override
        public String toString() {
            return " груз с массой " + MASS;
        }
    }


}
