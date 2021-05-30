package com.cdp.service.impl;

import com.cdp.dao.PositionDao;
import com.cdp.model.Position;
import com.cdp.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDao positionDao;

}
