package com.cdp.controller;

import com.cdp.model.Position;
import com.cdp.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PositionController {

    @Autowired
    private PositionService positionService;

}
