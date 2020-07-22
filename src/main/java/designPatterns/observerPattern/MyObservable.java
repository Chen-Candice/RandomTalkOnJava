package designPatterns.observerPattern;

import java.util.Observable;

/**
 *
 * @ClassName:MyObserverable
 * @Description:观察目标
 * @author denny.zhang
 * @date 2018年1月23日上午10:45:26
 * Reference: https://www.cnblogs.com/dennyzhangdd/p/8343229.html
 */
public class MyObservable extends Observable {
    //观察目标初始数据
    private String data = "data0";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        //如果数据变化了
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();//置变化状态为true
        }
        notifyObservers(data);//通知所有观察者
    }

}
