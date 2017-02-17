package cn.hiproject.pm.server.acount;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import cn.hiproject.pm.server.sql.SQLs;
import cn.hiproject.pm.shared.acount.AccountTablePageData;
import cn.hiproject.pm.shared.acount.IAccountService;

public class AccountService implements IAccountService {

	@Override
	public AccountTablePageData getAccountTableData(SearchFilter filter) {
		AccountTablePageData pageData = new AccountTablePageData();
		// TODO [hwu] fill pageData.
		
	    String sql = SQLs.ACCOUNT_PAGE_SELECT + SQLs.ACCOUNT_PAGE_DATA_SELECT_INTO; 
	    SQL.selectInto(sql, new NVPair("page", pageData)); 
		
		return pageData;
	}
}
