package designPatterns.observerPattern;

/**
 *
 * @ClassName:MyTest
 * @Description:利用JDK自带观察者Observer接口和，目标Observable类，测试样例。
 * @author denny.zhang
 * @date 2018年1月23日下午12:49:53
 * Reference: https://www.cnblogs.com/dennyzhangdd/p/8343229.html
 */
public class MyTest {

    public static void main(String[] args) {
        //构造观察目标
        MyObservable observerable = new MyObservable();
        //构造2个观察者实现类:Register MyObserver to MyObservable
        MyObserver observer1 = new MyObserver(observerable, "MyObserver_1");
        MyObserver observer2 = new MyObserver(observerable, "MyObserver_2");

        System.out.println("===1.目标初始值=" + observerable.getData());
        System.out.println("===2.给目标设置不同值[data1],看观察者是否触发更新！==========");
        //设置目标值
        observerable.setData("data1");
        System.out.println("===3.给目标设置想同值[data1],看观察者是否触发更新！==========");
        //设置目标相同值
        observerable.setData("data1");
    }
}
