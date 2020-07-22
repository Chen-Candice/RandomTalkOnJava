package designPatterns.observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @ClassName:MyObserver
 * @Description:观察者
 * @author denny.zhang
 * @date 2018年1月23日上午10:50:13
 * Reference: https://www.cnblogs.com/dennyzhangdd/p/8343229.html
 */
public class MyObserver implements Observer {

    private String name;

    public MyObserver(Observable o, String name) {
        o.addObserver(this);
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        System.out.println("MyObserver：" + name + " updated！new observable value : " + arg + ", Total Observers =" + o.countObservers());
    }

}
