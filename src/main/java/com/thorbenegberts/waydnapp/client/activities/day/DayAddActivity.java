package com.thorbenegberts.waydnapp.client.activities.day;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.thorbenegberts.waydnapp.client.ClientFactory;

/**
 * @author thorbenegberts
 */
public class DayAddActivity extends MGWTAbstractActivity
{

	private final ClientFactory clientFactory;

	/**
	 *
	 */
	public DayAddActivity(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;

	}

	@Override
	public void start(AcceptsOneWidget panel, final EventBus eventBus)
	{
		DayAddView view = clientFactory.getDayAddView();

		DayAddPresenter presenter = new DayAddPresenter();
		presenter.setClientFactory(clientFactory);

		view.setPresenter(presenter);

		panel.setWidget(view);
	}
}