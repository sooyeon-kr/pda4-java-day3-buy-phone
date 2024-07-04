public abstract class Phone {
    private String brand;


    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone() {}

    public void turnOn(){
        printLoadingMessage();
    }
    public String getBrand(){
        return brand;
    }

    public abstract void printLoadingMessage();
}
