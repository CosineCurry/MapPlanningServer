package com.demo.common.dao;

import com.demo.common.domain.News;
import com.demo.common.domain.NewsList;

import java.util.List;

/**
 * Created by Simon on 16/9/14.
 */
public interface NewsMapper {

    int insertNews(News news);

    List<News> selectAllNews();

    List<NewsList> selectAllNewsID();

    List<NewsList> selectAllNewsIDByType();

    List<NewsList> selectAllNewsIDByTime();

    List<NewsList> selectNewsLikeTitle(String title);

    News selectNewsByID(Integer id);

    int updateNewsAccessByID(News news);

    int updateNewsByID(News news);

    List<NewsList> selectNewsByType(Integer type);
}
