package red.packet.hbm.mybatis.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import red.packet.hbm.mybatis.mapper.TestMapper;
import red.packet.hbm.mybatis.model.Account;
import red.packet.hbm.mybatis.service.ITestService;

import javax.annotation.Resource;
import java.util.List;

@Service("testService")
public class TestServiceImpl implements ITestService {

    Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Resource
    private TestMapper testMapper;
    public void test() {
    }

    @Transactional(propagation= Propagation.REQUIRED )
    @Override
    public boolean transfer(float money, int from, int to) throws Exception {

        this.testMapper.minusMoney(from, money);
        int i = 1/0;
        this.testMapper.addMoney(to, money);
        return true;
    }

    @Override
    public int insertAccount(Account account){
        return this.testMapper.insertAccount(account);
    }

    @Override
    public Account findAccountById(int i) {

        return this.testMapper.getAccountById(i);
    }

    @Override

    public List<Account> findAccountsById(int i) {
        List<Account> accounts = this.testMapper.findAccountsById(i);
        return this.testMapper.findAccountsById(i);
    }
}
