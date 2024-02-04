package com.fyd.service;

import com.fyd.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
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
     *
     *   4.事务隔离级别(推荐使用第二个)
     *      1. 读未提交（Read Uncommitted）：事务可以读取未被提交的数据，容易产生脏读、不可重复读和幻读等问题。实现简单但不太安全，一般不用。
     *      2. 读已提交（Read Committed）：事务只能读取已经提交的数据，可以避免脏读问题，但可能引发不可重复读和幻读。
     *      3. 可重复读（Repeatable Read）：在一个事务中，相同的查询将返回相同的结果集，不管其他事务对数据做了什么修改。可以避免脏读和不可重复读，但仍有幻读的问题。
     *      4. 串行化（Serializable）：最高的隔离级别，完全禁止了并发，只允许一个事务执行完毕之后才能执行另一个事务。可以避免以上所有问题，但效率较低，不适用于高并发场景。
     */
    @Transactional(timeout = 3,rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED)
    public void changeInfo() throws FileNotFoundException {
        studentDao.updateAgeById(99,1);
        new FileInputStream("xxx");
        studentDao.updateNameById("test3",1);
    }

    @Transactional(readOnly = true)
    public void getStudentInfo(){

    }
}
