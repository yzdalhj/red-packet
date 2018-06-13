package red.packet.hbm.mybatis.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import red.packet.hbm.mybatis.mapper.TestXmlMapper;
import red.packet.hbm.mybatis.model.Account;
import red.packet.hbm.mybatis.service.ITestXmlService;

import javax.annotation.Resource;
import java.util.List;

@Service("testXmlService")
public class TestXmlServiceImpl implements ITestXmlService {

	Logger logger = LoggerFactory.getLogger(TestXmlServiceImpl.class);

	@Resource
	private TestXmlMapper testXmlDAO;
	public void test() {
	}

	@Transactional(propagation= Propagation.REQUIRED )
	public int insertAccount(Account account){
		return this.testXmlDAO.insertAccount(account);
	}

	@Override
	public Account findAccountById(int i) {
		
		return this.testXmlDAO.getAccountById(i);
	}

	@Override
	public List<Account> findAccountsById(int i) {
		List<Account> accounts = this.testXmlDAO.findAccountsById(i);
		return accounts;
	}

}
