package cn.hiproject.pm.server.acount;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import cn.hiproject.pm.shared.acount.AccountTablePageData;
import cn.hiproject.pm.shared.acount.IAccountService;

public class AccountService implements IAccountService {

	@Override
	public AccountTablePageData getAccountTableData(SearchFilter filter) {
		AccountTablePageData pageData = new AccountTablePageData();
		// TODO [hwu] fill pageData.
		return pageData;
	}
}
