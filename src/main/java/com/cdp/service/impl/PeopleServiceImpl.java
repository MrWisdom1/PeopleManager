package com.cdp.service.impl;

import com.cdp.dao.PeopleDao;
import com.cdp.model.People;
import com.cdp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    /**
     * 登录
     * @param P_account
     * @param P_password
     * @return
     */
    @Override
    public People login(String P_account, String P_password) {
        return peopleDao.login(P_account,P_password);
    }
}
