package com.company.design.observer.interfaces;

import com.company.design.observer.bean.EventVo;

/**
 * 定义一个接口，用来进行观察。
 */
public interface Observer {
    /**
     * 通知
     * @param eventVo 可以根据这个事件进行多种处理
     */
    public void wakeup(EventVo eventVo);
}
