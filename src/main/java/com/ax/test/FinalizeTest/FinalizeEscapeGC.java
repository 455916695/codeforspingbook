package com.ax.test.FinalizeTest;

public class FinalizeEscapeGC {

    public  static FinalizeEscapeGC SAVE_HOOK = null;

    public void iAlive() {
        System.out.println("我还活着");
    }

    protected  void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize  method  executed !");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public  static  void  main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();

        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK  != null){
            SAVE_HOOK.iAlive();
        }else {
            System.out.println(" 狗带 ");
        }

        //下面代码与上面的完全相同，但这次自救却失败
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null){
            SAVE_HOOK.iAlive();
        }else {
            System.out.println(" 狗带 ");
        }
    }
    //原因:任何对象的finalize（）方法都只会被系统自动调用一次

}
