import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        Scanner sc = new Scanner(System.in);
        String typing = "";

        System.out.println("Thời gian bắt đầu: " + sw.start());

        while(true) {
            if(typing.equalsIgnoreCase("Exit")) {
                break;
            } else {
                typing = sc.nextLine();
            }
        }

        System.out.println("Thời gian kết thúc: " + sw.stop());

        System.out.println("Tính: " + sw.getElapsedTime());

    }
}