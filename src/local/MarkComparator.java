package local;

import java.util.Comparator;

public class MarkComparator implements Comparator<SortingClass.Pupil> {

    @Override
    public int compare(SortingClass.Pupil o1, SortingClass.Pupil o2) {
        if (o1.getMARK() > o2.getMARK()) {
            return 1;
        } else if(o1.getMARK()==o2.getMARK()) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
