package cn.hiproject.pm.client.project;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import cn.hiproject.pm.client.project.ProjectListTablePage.Table;
import cn.hiproject.pm.shared.project.IProjectListService;
import cn.hiproject.pm.shared.project.ProjectListTablePageData;

@Data(ProjectListTablePageData.class)
public class ProjectListTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		// TODO [hwu] verify translation
		return TEXTS.get("ProjectList");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IProjectListService.class).getProjectListTableData(filter));
	}

	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}

	public class Table extends AbstractTable {

		public MyColumn getMyColumn() {
			return getColumnSet().getColumnByClass(MyColumn.class);
		}

		public ProjectIdColumn getProjectIdColumn() {
			return getColumnSet().getColumnByClass(ProjectIdColumn.class);
		}

		@Order(1000)
		public class ProjectIdColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("ProjectId");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}

			@Override
			protected boolean getConfiguredDisplayable() {
				return false;
			}

			@Override
			protected boolean getConfiguredPrimaryKey() {
				return true;
			}

		}

		@Order(2000)
		public class MyColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("MyNlsKey");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}
		
			
		
		
	}
}
