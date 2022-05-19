public class Taxi {
    int taxiNum;
    int oil;
    int speed;
    String destination;
    int basicDistance;
    int destinationDistance;
    int basicMoney;
    int distanceMoney;
    String state;


    public Taxi(){
        this.taxiNum = 1234;
        this.state = "일반";
        this.basicDistance = 1000;
        this.basicMoney = 3000;
        this.distanceMoney= 5000;
        this.destination = "서울역";

    }

    public void state(int oil){
        if (oil>10){
            System.out.println("운행가능");
        }
    }
    public void take(){
        if (state.equals("일반")){
            System.out.println("탑승 가능합니다.");
            state = "운행중";
            System.out.println("목적지 = " + destination);
        }else
            System.out.println("탑승 불가");
    }

    public void abc(int destinationDistance){
        if (basicDistance <destinationDistance ){ ///100 < 10000
            basicMoney+=distanceMoney;
            System.out.println("총 요금은 " + basicMoney + "원 입니다");
        }
    }

}

 class Test {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.state(20);
        taxi.take();
        taxi.abc(10000);

    }
}
