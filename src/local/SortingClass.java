package local;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class SortingClass {

    public final static ArrayList<Pupil> listOfPupil;

    static {
        listOfPupil = new ArrayList<Pupil>();
    }

    public static class Pupil implements Comparable<Pupil> {
        private final String NAME;
        private final int MARK;
        private final int AGE;

        public Pupil(String name, int mark, int age) {
            NAME = name;
            MARK = mark;
            AGE = age;
            listOfPupil.add(this);
        }

        public int getAGE() {
            return AGE;
        }

        public int getMARK() {
            return MARK;
        }

        public String getNAME() {
            return NAME;
        }

        @Override
        public String toString() {
            StringBuilder out = new StringBuilder();
            out.append("Pupil :").append("NAME = ").append(NAME).
                    append(", MARK = ").append(MARK)
                    .append(", AGE = ").append(AGE);
            return out.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pupil)) return false;
            Pupil pupil = (Pupil) o;
            return MARK == pupil.MARK &&
                    AGE == pupil.AGE &&
                    Objects.equals(NAME, pupil.NAME);
        }

        @Override
        public int hashCode() {
            return Objects.hash(NAME, MARK, AGE);
        }

        @Override
        public int compareTo(Pupil pupil) {
            return this.NAME.compareTo(pupil.getNAME());
        }


    }

    public static void printList() {
        for (Pupil people : listOfPupil) {
            System.out.println( people);
        }
    }

    public static void sortList() {
        Collections.sort(listOfPupil);
    }

    public static ArrayList<Pupil> getList() {
        return listOfPupil;

    }


}
