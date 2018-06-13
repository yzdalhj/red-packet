package red.packet.hbm.mybatis.service;

import red.packet.hbm.mybatis.model.Account;

import java.util.List;

public interface ITestXmlService {

	
	public int insertAccount(Account account) throws Exception;

	public Account findAccountById(int i);
	
	public List<Account> findAccountsById(int i);
}
