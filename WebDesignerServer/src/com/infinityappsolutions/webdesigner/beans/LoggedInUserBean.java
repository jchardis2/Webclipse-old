package com.infinityappsolutions.webdesigner.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * This bean provides the instance of the currently logged in user
 * 
 * @author Jimmy Hardison
 */
@SessionScoped
@ManagedBean(name = "loggedInUserBean")
public class LoggedInUserBean extends UserBean {
	/**
	 * This bean provides the instance of the currently logged in user
	 */
	public LoggedInUserBean() {

	}
}
