package headfirst.designpatterns.state.gumballstatewinner;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        System.out.println(gumballMachine);

        for (int i = 0; i < 10; i++) {
            // 售罄状态就中断
            if (gumballMachine.getState() instanceof SoldOutState) {
                System.out.println("Sold Out!");
                break;
            }

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
        }
    }
}
