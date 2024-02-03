package com.fyd;

import com.fyd.dyn.ProxyFactory;
import com.fyd.statics.CalculatorStaticProxy;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  21:35
 * Description:
 */
public class UseAop {
    public static void main(String[] args) {
        Calculator target = new CalculatorPureImpl();
        Calculator targetProxy = new CalculatorStaticProxy(target);

        int result = targetProxy.add(1, 2);

        // jdk代理
        ProxyFactory factory = new ProxyFactory(target);
        Calculator proxy1 = (Calculator) factory.getProxy();
        proxy1.add(1,1);
    }
}
