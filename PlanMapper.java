package com.demo.common.dao;

import com.demo.common.domain.Plan;
import com.demo.common.domain.PlanDetail;

import java.util.List;
import java.util.Map;

/**
 * Created by Simon on 16/8/16.
 */
public interface PlanMapper {
    int insertPlan(Plan plan);

    List<Plan> selectAllPlan();

    List<Plan> selectCompletePlan();

    Plan selectPlanById(Integer id);

    int updatePlan(Plan plan);

    int insertPlanDetail(PlanDetail planDetail);

    List<PlanDetail> selectPlanDetailByPlanId(Integer planId);

    PlanDetail selectPlanDetailById(Integer id);

    int updatePlanDetailStateById(Map map);

    List<PlanDetail> selectPlanDetailByUserId(Integer userId);

    List<PlanDetail> selectPlanDetailByStateNoPass();
}
