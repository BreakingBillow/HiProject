package cn.hiproject.pm.client.acount;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractSmartColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import cn.hiproject.pm.client.acount.AccountTablePage.Table;
import cn.hiproject.pm.client.common.CountryLookupCall;
import cn.hiproject.pm.shared.acount.AccountTablePageData;
import cn.hiproject.pm.shared.acount.IAccountService;

@Data(AccountTablePageData.class)
public class AccountTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		// TODO [hwu] verify translation
		return TEXTS.get("Account");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IAccountService.class).getAccountTableData(filter));
	}

	public class Table extends AbstractTable {

		public AccountFullNameColumn getAccountFullNameColumn() {
			return getColumnSet().getColumnByClass(AccountFullNameColumn.class);
		}

		public CountryColumn getCountryColumn() {
			return getColumnSet().getColumnByClass(CountryColumn.class);
		}

		public StatusColumn getStatusColumn() {
			return getColumnSet().getColumnByClass(StatusColumn.class);
		}

		public PasswordColumn getPasswordColumn() {
			return getColumnSet().getColumnByClass(PasswordColumn.class);
		}

		public PhoneColumn getPhoneColumn() {
			return getColumnSet().getColumnByClass(PhoneColumn.class);
		}

		public EmailColumn getEmailColumn() {
			return getColumnSet().getColumnByClass(EmailColumn.class);
		}

		public AccountNameColumn getAccountNameColumn() {
			return getColumnSet().getColumnByClass(AccountNameColumn.class);
		}

		public AccountIdColumn getAccountIdColumn() {
			return getColumnSet().getColumnByClass(AccountIdColumn.class);
		}

		@Order(1000)
		public class AccountIdColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("AccountId");
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
		public class AccountNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("AccountName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 150;
			}
		}

		@Order(3000)
		public class AccountFullNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("AccountFullName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 175;
			}
		}

		@Order(4000)
		public class EmailColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Email");
			}

			@Override
			protected int getConfiguredWidth() {
				return 125;
			}
		}

		@Order(5000)
		public class CountryColumn extends AbstractSmartColumn<String> {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Country");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}

			@Override
			protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
				return CountryLookupCall.class;
			}
		}

		@Order(6000)
		public class PhoneColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Phone");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}

			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(7000)
		public class PasswordColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Password");
			}

			@Override
			protected boolean getConfiguredDisplayable() {
				return false;
			}
			
			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(8000)
		public class StatusColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Status");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}
		
		

	}
}
