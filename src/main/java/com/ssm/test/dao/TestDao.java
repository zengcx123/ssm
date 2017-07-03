package com.ssm.test.dao;

import com.ssm.test.entity.Test;

import java.util.List;

/**
 * Created by zeng on 2017/6/28.
 */
public interface TestDao {

    List<Test> findTestList();
}
