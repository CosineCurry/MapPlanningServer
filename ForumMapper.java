package com.demo.common.dao;

import com.demo.common.domain.Forum;
import com.demo.common.domain.ForumComment;
import com.demo.common.domain.ForumLike;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/15.
 */
public interface ForumMapper {
    int insertForum(Forum forum);

    List<Forum> selectForum();

    Forum selectForumByForumId(Integer id);

    int updateForumByForum(Forum forum);

    List<Forum> selectForumByUserId(Integer userId);

    /*==========================================
       点赞系统
     ===========================================*/
    int insertForumLike(ForumLike forumLike);

    ForumLike selectForumLikeByForum(Map map);

    int deleteForumLikeByForum(Map map);

    List<ForumLike> selectForumLikeByForumId(Integer forumId);

    /*===========================================
        评论系统
     ============================================*/
    int insertForumComment(ForumComment forumComment);

    List<ForumComment> selectForumCommentByForum (Integer forumId);

    int deleteForumComment(Map map);

    List<ForumComment> selectForumCommentByUserId(Integer userId);
}
