package org.lcy.pattern.observer.subject;

import org.lcy.pattern.observer.core.Event;

public class Observer {

    public void advice(Event e) {
        System.out.println("触发事件，打印日志："+e.toString());
    }
}
