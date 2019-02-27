package com.demo.common.dao;

import com.demo.common.domain.Complete;

/**
 * Created by Administrator on 2016/12/11.
 */
public interface CompleteMapper {
    int insertComplete(Complete complete);

    Complete selectCompleteByPlanId (Integer planId);

    int updateComplete(Complete complete);

    Complete selectCompleteById(Integer id);
}
