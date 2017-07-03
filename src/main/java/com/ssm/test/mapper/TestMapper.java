package com.ssm.test.mapper;

import com.ssm.test.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zeng on 2017/6/28.
 */
public interface TestMapper {

    List<Test> findTestList();
}
