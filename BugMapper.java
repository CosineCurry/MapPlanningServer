package com.demo.common.dao;

import com.demo.common.domain.Bug;

import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface BugMapper {
    int insertBug(Bug bug);

    List<Bug> selectAllBug();

    Bug selectBugById(Integer id);
}
