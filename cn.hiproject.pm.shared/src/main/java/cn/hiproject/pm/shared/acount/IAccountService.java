package cn.hiproject.pm.shared.acount;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IAccountService extends IService {

	AccountTablePageData getAccountTableData(SearchFilter filter);
}
