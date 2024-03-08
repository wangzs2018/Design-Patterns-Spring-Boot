package headfirst.designpatterns.adapter.ducks.challenge;

import headfirst.designpatterns.adapter.ducks.Duck;
import headfirst.designpatterns.adapter.ducks.MallardDuck;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengshi.wang
 * @description: TODO
 * @date 2024/3/8
 */
public class DroneTest {
    public static void main(String[] args) {
        DroneAdapter droneAdapter = new DroneAdapter(new SuperDrone());

        List<Duck> duckList = new ArrayList<>();
        duckList.add(new MallardDuck());
        duckList.add(droneAdapter);

        for (Duck duck : duckList) {
            duck.quack();
            duck.fly();
        }
    }
}
