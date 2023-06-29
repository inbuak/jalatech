package com.manager;

import com.page.AutoCompletePage;
import com.page.CollapsiblePage;
import com.page.CssPropertiesPage;
import com.page.EmployeePage;
import com.page.EmployeeSearchPage;
import com.page.LinksPage;
import com.page.LoginPage;
import com.page.MenuPage;
import com.page.MultipleTabsPage;
import com.page.PopUpsPage;
import com.page.SliderPage;
import com.page.TooltipsPage;

public class PageObjectManager {

	private LoginPage login;
	
	private EmployeePage employee;
	
	private EmployeeSearchPage search;
	
	private MultipleTabsPage multiple;
	
	private AutoCompletePage auto;
	
	private CollapsiblePage collapse;
	
	private MenuPage menu;
	
	private TooltipsPage tool;
	
	private SliderPage slider;
	
	private PopUpsPage popup;
	
	private CssPropertiesPage css;
	
	private LinksPage links;
	
	public LoginPage getLogin() {
		return (login == null) ? login = new LoginPage() : login;
	}

	
	public EmployeePage getemployee() {
		return (employee == null) ? employee = new EmployeePage() : employee;

	}
	public EmployeeSearchPage getsearch() {
		return (search == null) ? search = new EmployeeSearchPage() : search;
	}
	
	public MultipleTabsPage getmultiple() {
		return (multiple == null) ? multiple = new MultipleTabsPage() : multiple;
	}
	
	public MenuPage getmenu() {
		return (menu == null) ? menu = new MenuPage() : menu;
	}
	

	public AutoCompletePage getauto() {
		return (auto == null) ? auto = new AutoCompletePage() : auto;
	}
	
	public CollapsiblePage getcollapse() {
		return (collapse == null) ? collapse = new CollapsiblePage() : collapse;
	}
	
	public TooltipsPage gettool() {
		return (tool == null) ? tool = new TooltipsPage() : tool;
	}
	
	public SliderPage getslider() {
		return (slider == null) ? slider = new SliderPage() : slider;
}
	public PopUpsPage getpopup() {
		return (popup == null) ? popup = new PopUpsPage() : popup;
}
	
	public CssPropertiesPage getcss() {
		return (css == null) ? css = new CssPropertiesPage() : css;
}
	public LinksPage getlinks() {
	return (links == null) ? links = new LinksPage() : links;
}
	
	
	
	
	
	
}