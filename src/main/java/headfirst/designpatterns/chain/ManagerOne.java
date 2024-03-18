package headfirst.designpatterns.chain;

import java.util.Objects;

public class ManagerOne implements BudgetHandler{

    private BudgetHandler nextHandler;

    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(nextHandler);
        if (amount<1000){
            System.out.println("小钱 ManagerOne批了");
            return true;
        }
        System.out.println(String.format("%d超出ManagerOne权限,请更高级管理层批复",amount));
        return nextHandler.handle(amount);
    }
}
