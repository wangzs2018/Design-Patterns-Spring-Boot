package headfirst.designpatterns.observer.propertychangeeven;

import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 消费者
 */
@Slf4j
public class PropertyListenerCustomerA implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        log.info("PLC-A received {}", evt.toString());
        log.info("PLC-A received {}", evt.getPropertyName());
        log.info("PLC-A received {}", evt.getOldValue());
        log.info("PLC-A received {}", evt.getNewValue());
    }
}

