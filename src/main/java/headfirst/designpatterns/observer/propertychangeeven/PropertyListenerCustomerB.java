package headfirst.designpatterns.observer.propertychangeeven;

import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@Slf4j
public class PropertyListenerCustomerB implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        log.info("PLC-B received {}", evt.toString());
    }
}

