package Task1;

import java.time.LocalDate;

public class Cat extends Animals{

    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ovnerName, LocalDate birthday) {
        super(name, illness, ovnerName, birthday);
    }
}
