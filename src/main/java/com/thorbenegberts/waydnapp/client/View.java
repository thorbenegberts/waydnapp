package com.thorbenegberts.waydnapp.client;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * @author thorbenegberts
 */
public interface View<T extends Presenter> extends IsWidget
{
	public void setPresenter(T presenter);
	public T getPresenter();
}
