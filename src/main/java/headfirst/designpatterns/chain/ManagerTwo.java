package headfirst.designpatterns.chain;

import java.util.Objects;

public class ManagerTwo implements BudgetHandler{

    private BudgetHandler nextHandler;
    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(nextHandler);

        if (amount<5000){
            System.out.println("小于5000块,我这个ManagerTwo可以决定:同意");
            return true;
        }
        System.out.println(String.format("%d超出ManagerTwo权限,请更高级管理层批复",amount));
        return nextHandler.handle(amount);
    }
}
