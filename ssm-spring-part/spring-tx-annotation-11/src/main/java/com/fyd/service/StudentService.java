package com.fyd.service;

import com.fyd.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;

    /**
     *  @ Transactional
     * 添加事务，方法上是当前方法有事务
     *          类上是类下的所有方法都有事务
     *   1.只读模式
     *   只读模式可以提升查询事务的效率！推荐事务只有查询代码，使用只读模式
     *   一般是在类上添加事务，这时候查询也会被添加事务，这个时候可以给查询添加只读
     */
    public void changeInfo(){
        studentDao.updateAgeById(88,1);
        int i = 1/0;
        System.out.println("-----------");
        studentDao.updateNameById("test2",1);
    }

    @Transactional(readOnly = true)
    public void getStudentInfo(){

    }
}
