package com.fyd.service;

import com.fyd.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;

    /**
     *  @ Transactional
     * 添加事务，方法上是当前方法有事务
     *          类上是类下的所有方法都有事务
     */
    @Transactional
    public void changeInfo(){
        studentDao.updateAgeById(88,1);
        int i = 1/0;
        System.out.println("-----------");
        studentDao.updateNameById("test2",1);
    }
}
