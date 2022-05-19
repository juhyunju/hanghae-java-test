import java.util.Scanner;

class Bus {
    int maxPassenger;
    int nowPassenger;
    int passenger;
    int money;
    int busNum;
    int oil;
    int speed;
    String state;

    public Bus() {
        this.state = "운행 중입니다";
        this.busNum = 1234;
        this.maxPassenger = 20;
        this.money=1000;
    }

    public void busNum() {
        System.out.println("버스번호" + " " + busNum);
    }

    public void check(int oil) {
        if (oil < 10 || state.equals("종료")) { //11 < 10
            System.out.println("주유가 필요합니다.");
            state = "차고지행";
            System.out.println(state);
        } else {
            state = "운행중";
            System.out.println(state);
        }
    }

    public void take(int now) {
        if (now< maxPassenger && state.equals("운행중")) {
            nowPassenger += now;
            nowPassenger++;
            money = money *nowPassenger;
            passenger = maxPassenger-nowPassenger;
            System.out.println("현재 탑승 인원은" + " " + nowPassenger + "명입니다." + "요금은" + money + " 잔여 승객 수 " + passenger);
        } else {
            System.out.println("탑승 불가");
        }
    }

    public void speed(int inputSpeed) {
        if (oil < 10) { // 11 < 10
            speed = 50;
            System.out.println("현재 속도" + " "+ speed +" " + "km 입니다.");
            if (inputSpeed + speed > 0) {
                Scanner sc = new Scanner(System.in);
                inputSpeed = sc.nextInt();
                speed += inputSpeed;
                System.out.println("변경된 속도는" + " " + speed + " " + "km 입니다.");
            }

        } else {
            System.out.println("주유량을 확인해주세요");
        }

    }

}

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.busNum();
        bus.check(-45);
        bus.take(15);
        bus.speed(20);

    }
}