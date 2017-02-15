package cn.hiproject.pm.client.project;

import java.util.List;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;


import cn.hiproject.pm.shared.Icons;

/**
 * <h3>{@link HiProjectOutline}</h3>
 *
 * @author hwu
 */
@Order(1000)
public class HiProjectOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		//pageList.add(new HelloWorldPage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Projects");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Category;
	}
}
