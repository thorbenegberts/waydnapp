package com.thorbenegberts.waydnapp.client.activities.day;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by tegberts on 09.03.14.
 */
public class DayViewImpl implements DayView
{
	private SimplePanel w = new SimplePanel();
	private DayPresenter presenter;

	public DayViewImpl()
	{
		w.add(new Label("All the 'day' stuff here"));
	}

	@Override
	public Widget asWidget()
	{
		return w;
	}

	@Override
	public void setPresenter(DayPresenter presenter)
	{
		this.presenter = presenter;
	}

	@Override
	public DayPresenter getPresenter()
	{
		return presenter;
	}
}