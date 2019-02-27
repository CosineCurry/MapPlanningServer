package com.demo.common.dao;

import com.demo.common.domain.Feedback;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 */
public interface FeedbackMapper {
    int insertFeedback(Feedback feedback);

    List<Feedback> selectAllFeedback();

    List<Feedback> selectFeedbackByCompleteId(Integer completeId);

    List<Feedback> selectFeedbackByUserId(Integer userId);

    Feedback selectFeedbackById(Integer id);

    int updateFeedback(Feedback feedback);
}
