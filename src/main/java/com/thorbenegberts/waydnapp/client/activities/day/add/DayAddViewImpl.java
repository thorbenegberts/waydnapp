package com.thorbenegberts.waydnapp.client.activities.day.add;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by tegberts on 09.03.14.
 */
public class DayAddViewImpl implements DayAddView
{
	private SimplePanel w = new SimplePanel();
	private DayAddPresenter presenter;

	public DayAddViewImpl()
	{
		w.add(new Label("day add view"));
	}

	@Override
	public Widget asWidget()
	{
		return w;
	}

	@Override
	public void setPresenter(DayAddPresenter presenter)
	{
		this.presenter = presenter;
	}

	@Override
	public DayAddPresenter getPresenter()
	{
		return presenter;
	}
}