public class Hello {
    public static void main(String[] args) throws InterruptedException {

        int num = 0;

        while (true) {
            num = num + 5;

            System.out.println("Value: " + num);

            Thread.sleep(3000); // Wait 3 seconds
        }
    }
}
