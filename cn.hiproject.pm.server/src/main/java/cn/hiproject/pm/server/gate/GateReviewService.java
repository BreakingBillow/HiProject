package cn.hiproject.pm.server.gate;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import cn.hiproject.pm.shared.gate.GateReviewTablePageData;
import cn.hiproject.pm.shared.gate.IGateReviewService;

public class GateReviewService implements IGateReviewService {

	@Override
	public GateReviewTablePageData getGateReviewTableData(SearchFilter filter) {
		GateReviewTablePageData pageData = new GateReviewTablePageData();
		// TODO [hwu] fill pageData.
		return pageData;
	}
}
