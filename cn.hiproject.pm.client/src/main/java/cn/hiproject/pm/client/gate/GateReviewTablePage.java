package cn.hiproject.pm.client.gate;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import cn.hiproject.pm.client.gate.GateReviewTablePage.Table;
import cn.hiproject.pm.shared.gate.GateReviewTablePageData;
import cn.hiproject.pm.shared.gate.IGateReviewService;

@Data(GateReviewTablePageData.class)
public class GateReviewTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		// TODO [hwu] verify translation
		return TEXTS.get("GateReview");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IGateReviewService.class).getGateReviewTableData(filter));
	}

	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	public class Table extends AbstractTable {
	}
}
