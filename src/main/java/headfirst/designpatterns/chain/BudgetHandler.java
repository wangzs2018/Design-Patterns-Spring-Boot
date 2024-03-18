package headfirst.designpatterns.chain;

/**
 * 预算处理器
 */
public interface BudgetHandler {
    void setNextHandler(BudgetHandler nextHandler);
    boolean handle(int amount);
}
