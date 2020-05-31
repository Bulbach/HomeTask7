package local;

import java.util.HashSet;

public class SetClass {

    private final static HashSet<Card> BANKCARD;

    static {
        BANKCARD = new HashSet <>();
    }

    public static class Card{
        private final int identificationNumber;

        public Card(int number){
            identificationNumber=number;
            BANKCARD.add(this);
        }

        public int getIdentificationNumber() {
            return identificationNumber;
        }
    @Override
    public String toString() {
        return String.valueOf(getIdentificationNumber());
    }
    }



    public static HashSet<Card> getBANKCARD() {
        return BANKCARD;
    }
}
