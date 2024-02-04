package com.fyd.service;

import com.fyd.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
     *
     *   2.超时时间
     *   默认：永远不超时
     *   设置timeout 超过时间就会回滚事务和释放异常：TransactionTimedOutException
     *
     *   3.指定异常回滚，和指定异常不回滚
     *      默认情况下，指定发生运行时异常事务才会回滚
     *      我们可以指定Exception都会回滚
     *      rollbackFor = Exception.class
     */
    @Transactional(timeout = 3,rollbackFor = Exception.class)
    public void changeInfo() throws FileNotFoundException {
        studentDao.updateAgeById(99,1);
        new FileInputStream("xxx");
        studentDao.updateNameById("test3",1);
    }

    @Transactional(readOnly = true)
    public void getStudentInfo(){

    }
}
