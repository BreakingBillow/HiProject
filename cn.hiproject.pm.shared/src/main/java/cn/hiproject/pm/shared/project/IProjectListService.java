package cn.hiproject.pm.shared.project;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IProjectListService extends IService {

	ProjectListTablePageData getProjectListTableData(SearchFilter filter);
}
