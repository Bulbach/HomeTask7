package local;

import java.util.Comparator;

public class AgeComparator implements Comparator<SortingClass.Pupil> {
    @Override
    public int compare(SortingClass.Pupil o1, SortingClass.Pupil o2) {
        if (o1.getAGE()>o2.getAGE()){
            return 1;
        }else if (o1.getAGE()==o2.getAGE()){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
