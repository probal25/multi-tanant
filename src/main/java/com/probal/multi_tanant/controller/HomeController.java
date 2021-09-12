package com.probal.multi_tanant.controller;

import com.probal.multi_tanant.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @Autowired
    AccountDao accountDao;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public Object list(HttpServletRequest request) throws Exception {
        return accountDao.findAll();
    }
}
