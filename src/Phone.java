public class Phone {
    private String brand;
    private String symbol;
    private String buyer;


    public Phone(String brand, String symbol, String buyer) {
        this.brand = brand;
        this.buyer = buyer;
        setSymbol(symbol);

    }

    private void setSymbol(String symbol) {
        this.symbol = symbol.repeat(3);
    }

    public void buy(){
        System.out.printf("%s님이 %s폰을 구매했습니다.\n", buyer, brand);
    }
    public void turnOn(){
        System.out.printf("%s님이 %s폰을 켰습니다. \n", buyer, brand);
        printLoadingMessage();
    }
    public void printLoadingMessage(){
        System.out.printf("%s 폰 켜지는 중 %s \n\n", symbol, symbol);
    }
}
