package beanlifecycle;

public class BeansLifeCycle {
    public  void init(){
        System.out.println("init()");
    }
    public void destroy(){
        System.out.println("destroy()");
    }
}
