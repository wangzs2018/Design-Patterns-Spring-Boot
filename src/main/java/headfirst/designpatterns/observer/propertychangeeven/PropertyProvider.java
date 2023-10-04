package headfirst.designpatterns.observer.propertychangeeven;

import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyChangeSupport;

/**
 * 创建生产者
 */
@Slf4j
public class PropertyProvider {

    public void publishPropertyChange() {
        PropertyListenerCustomerA plca = new PropertyListenerCustomerA();
        PropertyListenerCustomerB plcb = new PropertyListenerCustomerB();
        PropertyListenerCustomerC plcc = new PropertyListenerCustomerC();

        PropertyChangeSupport support = new PropertyChangeSupport(this);
        support.addPropertyChangeListener(plca);
        support.addPropertyChangeListener(plcb);
        support.addPropertyChangeListener(plcc);

        support.firePropertyChange("aspirin", 18, 25);
        log.info("----------------------------");
        support.firePropertyChange("address", "上海", "北京");
    }
}
