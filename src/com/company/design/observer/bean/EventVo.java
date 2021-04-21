package com.company.design.observer.bean;

/**
 * 用于通知观察者事件发生的详细情况
 */
public class EventVo {
    private Object source;
    private int eventId;
    private String eventStr;

    public EventVo(Object source, int eventId, String eventStr) {
        this.source = source;
        this.eventId = eventId;
        this.eventStr = eventStr;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventStr() {
        return eventStr;
    }

    public void setEventStr(String eventStr) {
        this.eventStr = eventStr;
    }

    @Override
    public String toString() {
        return "EventVo{" +
                "source=" + source +
                ", eventId=" + eventId +
                ", eventStr='" + eventStr + '\'' +
                '}';
    }
}
