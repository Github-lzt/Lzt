package com.hr.controller;

import com.hr.entity.AoaUser;
import com.hr.service.AoaUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("aoaUser")
public class AoaUserController {

    private AoaUserService aoaUserService;

    @ResponseBody
    @RequestMapping("login")
    public String login(AoaUser user){



        return "";
    }




}
