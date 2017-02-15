package cn.hiproject.pm.shared.gate;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IGateReviewService extends IService {

	GateReviewTablePageData getGateReviewTableData(SearchFilter filter);
}
