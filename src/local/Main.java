package local;

//import static local.SetClass.BANKCARD;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

import static local.SortingClass.listOfPupil;
import static local.SortingClass.sortList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Всеми любимая очередь");

        Person hospitalQueue = new Person(4);
        int counter = 0;

        while (!hospitalQueue.getPersons().isEmpty()) {
            counter++;
            if (Person.getNowPosition() < hospitalQueue.AMOUNT_DEQUE) {
                hospitalQueue.getPersons().add(++Person.nowPosition);}

            if (counter % 3 == 0) {
                    hospitalQueue.printPatient(hospitalQueue.getPersons().pollLast().toString() + "Мне только спросить");
                }
            else {
                hospitalQueue.printPatient(hospitalQueue.getPersons().pollFirst().toString());
            }
        }

        System.out.println("Попытка гонки на выбывание");
        Person whoIsLast = new Person(27);
        whoIsLast.knockOutRace();


        System.out.println("Вторая часть ");
        ListClass list = new ListClass();
        System.out.println(list.getScroll(10));
        System.out.println("===============");
        System.out.println(list.deleteScroll());

        System.out.println("Игра дженга ");
        System.out.println(list.getJenga(15));
        System.out.println("============");
        list.playJenga();

        System.out.println("Банковские карты");
        SetClass.Card card = new SetClass.Card(23453);
        SetClass.Card card1 = new SetClass.Card(986875);
        SetClass.Card card2=new SetClass.Card(333321);
        SetClass.Card card3=new SetClass.Card(334424);
        System.out.println(SetClass.getBANKCARD());
        System.out.println("===============");

        System.out.println("Социальна сеть ");
        SocialNetwork network = new SocialNetwork();
        SocialNetwork.registerMember("Ваня","Сенпай");
        SocialNetwork.registerMember("Леха","Зеленый");
        SocialNetwork.registerMember("Саня","Умник");
        SocialNetwork.registerMember("Оля","Умница");
        SocialNetwork.registerMember("Рома","Новенький");
        SocialNetwork.registerMember("Деня","Бетмен");
        System.out.println(SocialNetwork.getMembers());
        SocialNetwork.unRegisterMember("Деня");
        System.out.println(SocialNetwork.getMembers());
        System.out.println("================");

        System.out.println("Список учеников");
        new SortingClass.Pupil("Ваня",9,13);
        new SortingClass.Pupil("Леха",6,12);
        new SortingClass.Pupil("Леля",8,12);
        new SortingClass.Pupil("Деня",5,11);
        new SortingClass.Pupil("Саня",7,14);

        System.out.println(listOfPupil);
        sortList();
        System.out.println(listOfPupil);
        new SortingClass.Pupil("Аня",6,10);
        sortList();
        System.out.println(listOfPupil);
        MarkComparator marks = new MarkComparator();
        SortingClass.getList().sort(marks);
        System.out.println("");
        SortingClass.printList();

        AgeComparator ages = new AgeComparator();
        SortingClass.getList().sort(ages);
        System.out.println("");
        SortingClass.printList();

    }

}