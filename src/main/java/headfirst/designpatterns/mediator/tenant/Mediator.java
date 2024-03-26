package headfirst.designpatterns.mediator.tenant;

/**
 * 抽象中介者
 **/
public abstract class Mediator {

    //申明一个联络方法
    public abstract void contact(String message,Person person);
}

