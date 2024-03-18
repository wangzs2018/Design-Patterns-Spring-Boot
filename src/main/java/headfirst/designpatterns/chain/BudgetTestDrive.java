package headfirst.designpatterns.chain;

public class BudgetTestDrive {
    public static void main(String[] args) {
        applyBudget();
    }

    public static void applyBudget() {

        ManagerOne one = new ManagerOne();
        ManagerTwo two = new ManagerTwo();
        ManagerThree three = new ManagerThree();
        one.setNextHandler(two);
        two.setNextHandler(three);

        one.handle(500);
        System.out.println("=============");

        one.handle(1500);
        System.out.println("=============");

        one.handle(5500);
        System.out.println("=============");

        one.handle(55000);
        System.out.println("=============");
    }
}
