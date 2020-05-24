package local;

import java.util.Collections;
import java.util.LinkedList;

public class Person {

    static int nowPosition;
    public final int AMOUNT_DEQUE = 25;
    private final LinkedList<Integer> persons;


    public Person (int nowPosition){
        Person.nowPosition = nowPosition;
        persons = new LinkedList<>();
        for(int i =1;i<=nowPosition;i++){
            persons.add(i);
        }
    }

    public LinkedList<Integer> getPersons() {
        return persons;
    }

    public static int getNowPosition() {
        return nowPosition;
    }

    public void printPatient(String patient ){
        System.out.println("Очередной пациент № " + patient);
    }
    public void knockOutRace(){
        while (!persons.isEmpty()){
            Collections.shuffle(persons);
            System.out.println(persons);
            System.out.println(persons.pollLast());
        }
    }

    @Override
    public String toString() {
        return persons.toString();
    }
}
