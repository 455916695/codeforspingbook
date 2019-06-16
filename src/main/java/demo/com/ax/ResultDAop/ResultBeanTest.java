package demo.com.ax.ResultDAop;

import org.junit.Test;

public class ResultBeanTest {

    @Test
    public void test() {
        Object o = null;
        try {
            o = new Person("你好",1);
//            int i = 1 / 0;
//            o = new MyFail();
        } catch (ArithmeticException a) {
            o = a;
        }

//        ResultBean resultBean = new ResultBean<Object>(o);
        ResultBean resultBean = new ResultBean (o);

        System.out.println(resultBean);

    }


}
