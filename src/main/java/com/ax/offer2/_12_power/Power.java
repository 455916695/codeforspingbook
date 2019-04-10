package com.ax.offer2._12_power;

/**
 *   实现函数  double Power(double interfacepackage,int  exponent)
 *          1.求base的exponent 次方
 *          2.不考虑数据过大的情况
 *          3.不能调用 库 内方法
 * */
public class Power {

    double  Power(double base,int exponent){
        if(exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        //考虑 exponent 是负数
        if(exponent > 0){
            double power = power(base,exponent);
            return power;
        }else {
            double power = power(base,~(exponent-1));   //  ~(exponent-1)  ===》 等价于 * -1
            if (power == 0){
                throw new RuntimeException("1/0 计算异常，分母不能为零 ");
            }
            return  1/power;
        }
    }
    public double power(double base,int exponent){
        double power = Power(base, exponent >> 1);
        power *= power;
        if ((exponent & 1) == 1)
            power *= base;
        return power;
    }

}
