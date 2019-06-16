package demo.com.ax.ResultDAop;


public class ResultBean {

    private static final int SUCCESS = 1;
    private static final int FAIL = 0;
    private static final int ERROR = -1;
    private static final int EXCEPTION = -2;
    private static final int UNKONWEXCEPTION = -3;

    private int code = SUCCESS;

    private String message = "成功";

    private Object data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public ResultBean(Object obj) {

        if (obj instanceof Throwable) {
            Throwable throwable = (Throwable) obj;
            if (throwable instanceof MyException) {
                code = EXCEPTION;
                message = "MyException";
            } else {
                code = UNKONWEXCEPTION;
                message = "UnknowException";
            }
        } else if (obj instanceof MyFail) {
            code = FAIL;
            message = "FAIL";
        } else {
            code = SUCCESS;
            message = "SUCCESS";
            data = obj;
        }

    }


    @Override
    public String toString() {
        return "ResultBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
