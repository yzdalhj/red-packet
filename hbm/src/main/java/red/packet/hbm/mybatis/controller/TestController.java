package red.packet.hbm.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import red.packet.hbm.mybatis.model.Account;
import red.packet.hbm.mybatis.service.ITestService;
import red.packet.hbm.mybatis.service.ITestXmlService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@Controller
public class TestController {
    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TestController.class);
    @Autowired
    private ITestService testService;

    @Autowired
    private ITestXmlService testXmlService;

    @ResponseBody
    @RequestMapping("/test")
    public List<Account> test(HttpServletRequest request, HttpServletResponse response) {
        List<Account> accountList = this.testService.findAccountsById(3);
        logger.info(accountList);
        return accountList;
    }
    @ResponseBody
    @RequestMapping("/testXml")
    public List<Account> testXml(HttpServletRequest request, HttpServletResponse response) {
        List<Account> accountList = this.testXmlService.findAccountsById(3);
        logger.info(accountList);
        return accountList;
    }
}
