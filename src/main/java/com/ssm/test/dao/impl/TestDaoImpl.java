package com.ssm.test.dao.impl;

import com.ssm.test.dao.TestDao;
import com.ssm.test.entity.Test;
import com.ssm.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zeng on 2017/6/28.
 */
@Repository
public class TestDaoImpl implements TestDao{

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> findTestList() {
        return testMapper.findTestList();
    }
}
