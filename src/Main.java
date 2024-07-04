//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Galaxy galaxy23 = new Galaxy("삼송");
        Person jaeyong = new Person("재용");
        jaeyong.buyPhone(galaxy23);
        jaeyong.turnOnPhone();

        Apple apple = new Apple("애플");
        Person jobs = new Person("잡스");
        jobs.buyPhone(apple);
        jobs.turnOnPhone();
    }
}