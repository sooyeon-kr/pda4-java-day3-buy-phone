public class Galaxy extends Phone{
    public Galaxy(String brand){
        super(brand);
    }

    @Override
    public void printLoadingMessage(){
        System.out.println("*** 폰 켜지는 중 ***");
    }

}
