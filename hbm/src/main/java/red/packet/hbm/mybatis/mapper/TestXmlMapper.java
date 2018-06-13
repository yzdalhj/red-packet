package red.packet.hbm.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import red.packet.hbm.mybatis.model.Account;

import java.util.List;

@Mapper
public interface TestXmlMapper {

    public int addMoney(int userId, float money);

    public int minusMoney(int userId, float money);

    //@CacheEvict(value = {"indexCache"},allEntries = true,beforeInvocation = true)
    public int insertAccount(Account account);

    //@Cacheable(value = "indexCache",key = "'xmlgetAccountById'+#id")
    public Account getAccountById(int id);

    //@Cacheable(value = "indexCache",key = "'xmlfindAccountsById'+#id")
    public List<Account> findAccountsById(int id);
}
