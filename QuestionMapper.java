package com.demo.common.dao;

import com.demo.common.domain.Question;

import java.util.List;

/**
 * Created by Simon on 16/9/7.
 */
public interface QuestionMapper {
    List<Question> selectAllQuestion();

    int insertQuestion(Question question);

    Question selectQuestionById(Integer id);

    int updateQuestionById(Question question);

    List<Question> selectQuestionByTitle(String title);
}
