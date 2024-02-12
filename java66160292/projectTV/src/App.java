public class App {
    public static void main(String[] args) throws Exception {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);

        System.out.println(tv1.channel);
        System.out.println(tv1.on);

    }
}
