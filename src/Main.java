//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone apple = new Phone("애플", "@", "잡스");
        Phone samsong = new Phone("삼송", "*", "재용");
        apple.buy();
        apple.turnOn();

        samsong.buy();
        samsong.turnOn();
    }
}