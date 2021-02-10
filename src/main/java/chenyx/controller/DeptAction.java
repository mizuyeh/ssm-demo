package chenyx.controller;

import chenyx.dao.impl.DeptDaoImpl;
import chenyx.entity.Dept;
import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.logging.Logger;

@Controller
public class DeptAction {
    @Resource
    private DeptDaoImpl deptDao;

    @RequestMapping(value = "/insert.action")
    public String insert(Dept dept) {
        System.out.println("--------------执行");
        deptDao.insertDept(dept);
        return "main.jsp";
    }
}
