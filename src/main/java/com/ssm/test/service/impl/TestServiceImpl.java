package com.ssm.test.service.impl;

import com.ssm.test.dao.TestDao;
import com.ssm.test.entity.Test;
import com.ssm.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zeng on 2017/6/28.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<Test> findTestList() {
        return testDao.findTestList();
    }
}
