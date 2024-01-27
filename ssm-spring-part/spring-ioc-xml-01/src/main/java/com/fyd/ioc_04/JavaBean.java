package com.fyd.ioc_04;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/1/27  19:43
 * Description:
 */
public class JavaBean {
    /**
     * 必须是public void 命名随意
     */
    public void init(){
        System.out.println("JavaBean.init");
    }

    public void destroy(){
        System.out.println("JavaBean.destroy");
    }
}
