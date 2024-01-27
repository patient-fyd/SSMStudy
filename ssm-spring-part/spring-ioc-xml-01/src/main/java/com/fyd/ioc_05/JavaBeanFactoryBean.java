package com.fyd.ioc_05;

import org.springframework.beans.factory.FactoryBean;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/1/27  21:23
 * Description:
 */
public class JavaBeanFactoryBean implements FactoryBean<JavaBean> {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public JavaBean getObject() throws Exception {
        // 使用你自己的方式实例化对象
        JavaBean javaBean = new JavaBean();
        javaBean.setName(value);
        return javaBean;
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }

}
