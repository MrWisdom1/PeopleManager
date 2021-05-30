package com.cdp.service;

import com.cdp.model.People;
import org.apache.ibatis.annotations.Param;

public interface PeopleService {
    /**
     * 登录
     * @param P_account
     * @param P_password
     * @return
     */
    People login(@Param("P_account") String P_account, @Param("P_password") String P_password);
}
