package local;

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
    }

}