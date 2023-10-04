package headfirst.designpatterns.observer.propertychangeeven;

/**
 * 因为Observable类在jdk1.9后已被标记为弃用状态，推荐使用PropertyEvent等方式替代。
 * 所以以下代码是PropertyChangeEven、PropertyChangeListener 实现的观察者模式。
 */
public class PropertyMain {
    public static void main(String[] args) {
        PropertyProvider propertyPublishService = new PropertyProvider();
        propertyPublishService.publishPropertyChange();
    }
}
