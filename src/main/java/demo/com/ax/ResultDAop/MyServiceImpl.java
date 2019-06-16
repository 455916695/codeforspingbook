package demo.com.ax.ResultDAop;



public class MyServiceImpl implements MyService {
    @Override
    public Object createException() {

        MyException myException = new MyException("MyException");

        if ((1 - 1) == 0) {
            return myException;
        }
        return  new String("MyException");
    }

    @Override
    public Object createSuccess() {

        return new String("成功");
    }

    @Override
    public Object createUnknowException() {

        Throwable throwable = new Throwable();

        return throwable;
    }

    @Override
    public Object createFAIL() {

        return new MyFail();

    }
}
