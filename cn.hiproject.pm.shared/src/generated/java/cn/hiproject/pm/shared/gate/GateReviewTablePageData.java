package cn.hiproject.pm.shared.gate;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "cn.hiproject.pm.client.gate.GateReviewTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class GateReviewTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public GateReviewTableRowData addRow() {
		return (GateReviewTableRowData) super.addRow();
	}

	@Override
	public GateReviewTableRowData addRow(int rowState) {
		return (GateReviewTableRowData) super.addRow(rowState);
	}

	@Override
	public GateReviewTableRowData createRow() {
		return new GateReviewTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return GateReviewTableRowData.class;
	}

	@Override
	public GateReviewTableRowData[] getRows() {
		return (GateReviewTableRowData[]) super.getRows();
	}

	@Override
	public GateReviewTableRowData rowAt(int index) {
		return (GateReviewTableRowData) super.rowAt(index);
	}

	public void setRows(GateReviewTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class GateReviewTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
	}
}
