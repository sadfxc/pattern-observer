package org.lcy.pattern.observer.subject;

import org.lcy.pattern.observer.core.Event;

import java.lang.reflect.Method;

public class ObserverTest {

    public static void main(String[] args) {
        try {
            //观察者
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});


            Subject subject = new Subject();
            subject.addLisenter(SubjectEventType.ON_ADD,observer,advice);

            subject.add();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
