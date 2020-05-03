package org.lcy.pattern.observer.subject;

import org.lcy.pattern.observer.core.EventLisenter;

public class Subject extends EventLisenter {

    //通常的话采用动态代理来实现监控，避免了代码侵入
    public void add() {
        System.out.println("调用添加的方法:");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove() {
        System.out.println("调用删除的方法");
        trigger(SubjectEventType.ON_REMOVE);
    }


}
