package demo.com.ax.ResultDAop;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javassist.bytecode.annotation.BooleanMemberValue;
import org.junit.Before;
import org.junit.Test;


public class ServiceProxyTest {

    private MyService myService;

    public MyService getMyService() {
        return myService;
    }

    public void setMyService(MyService myService) {
        this.myService = (MyService) new MyServieProxy().createProxy(myService);
    }

    @Before
    public void init() {
        MyService service = new MyServiceImpl();
        setMyService(service);
    }

    @Test
    public void test()  {


        MyService myService = getMyService();

        ResultBean resultBean = null;

//        resultBean = new ResultBean(myService.createSuccess());
//        System.out.println(resultBean);
//
//        resultBean = new ResultBean(myService.createFAIL());
//        System.out.println(resultBean);

//      对于异常识别上存在问题  暂时无法解决这个问题
        resultBean = new ResultBean(myService.createException());
        System.out.println(resultBean);

//        resultBean = new ResultBean(myService.createUnknowException());
//        System.out.println(resultBean);


    }


    @Test
    public void testWarp() {
        Boolean b = true;

        Boolean t = true;

        Boolean t2 = new Boolean(true);

        boolean z = (b == t);
        System.out.println(z);

        z = (b == t2);
        System.out.println(z);
    }

}
