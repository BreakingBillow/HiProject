package cn.hiproject.pm.server.project;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import cn.hiproject.pm.shared.project.IProjectListService;
import cn.hiproject.pm.shared.project.ProjectListTablePageData;

public class ProjectListService implements IProjectListService {

	@Override
	public ProjectListTablePageData getProjectListTableData(SearchFilter filter) {
		ProjectListTablePageData pageData = new ProjectListTablePageData();
		// TODO [hwu] fill pageData.
		return pageData;
	}
}
