package Task1;

import java.time.LocalDate;

public class Animals {
    private String name;
    private Illness illness;
    private String ovnerName;
    private LocalDate birthday;

    public Animals() {
    }
    public Animals(String name, Illness illness, String ovnerName, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ovnerName = ovnerName;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Illness getIllness() {
        return illness;
    }
    private void toWakeUp(){
        System.out.println(getClass().getSimpleName() + " woke up");
    }
    private void toWakeUp(String time){
        System.out.println(getClass().getSimpleName() + " woke up at "+time);
    }
    private void eat(){
        System.out.println(getClass().getSimpleName() + " ate");
    }
    private void play(){
        System.out.println(getClass().getSimpleName() + " played");
    }
    private void sleep(){
        System.out.println(getClass().getSimpleName() + " sleep");
    }
    public void liveCycle(){
        toWakeUp();
        eat();
        play();
        sleep();
    }
}
