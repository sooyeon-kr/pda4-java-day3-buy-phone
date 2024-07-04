public class Person {
    private String name;
    private Phone phone;

    Person(String name) {
        this.name = name;
    }

    public void buyPhone(Phone phone){
        this.phone = phone;
        System.out.printf("%s님이 %s폰을 구매했습니다.\n", name, phone.getBrand());
    }

    public void turnOnPhone(){
        System.out.printf("%s님이 %s폰을 켰습니다.\n", name, phone.getBrand());
        phone.turnOn();
    }
}
