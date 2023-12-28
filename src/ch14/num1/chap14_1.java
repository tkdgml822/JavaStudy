package ch14.num1;

class Car {
    int gasolineGauge; // 가솔린 잔여량

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }
}

class HybridCar extends Car { // 하이브리드 자동차
    int electricGauge; // 전기 배터리 잔여량

    public HybridCar(int electricGauge, int gasolineGauge) {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }
}

class HybridWaterCar extends HybridCar { // 하이브리드 워터카
    int waterGauge; // 에너지 전환용 물의 잔여량

    public HybridWaterCar(int waterGauge, int electricGauge, int gasolineGauge) {
        super(electricGauge, gasolineGauge);
        this.waterGauge = waterGauge;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린: " + gasolineGauge);
        System.out.println("잔여 전기량: " + electricGauge);
        System.out.println("잔여 워처량: " + waterGauge);
    }
}

public class chap14_1 {
    public static void main(String[] args) {
        HybridWaterCar Hy1 = new HybridWaterCar(1, 4 ,2);
        Hy1.showCurrentGauge();

        HybridWaterCar Hy2 = new HybridWaterCar(3, 5 ,6);
        Hy2.showCurrentGauge();
    }
}
