package com.company.project.webapi.support.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Action
 *
 * @author wangzhj
 */
public interface Action {

    /**
     * 执行
     *
     * @param request
     * @param response
     * @return Map
     */
    Map<String, Object> doExecute(HttpServletRequest request, HttpServletResponse response);
}
