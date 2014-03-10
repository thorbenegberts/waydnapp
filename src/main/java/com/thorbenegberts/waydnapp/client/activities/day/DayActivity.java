package com.thorbenegberts.waydnapp.client.activities.day;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.thorbenegberts.waydnapp.client.ClientFactory;

/**
 * @author thorbenegberts
 */
public class DayActivity extends MGWTAbstractActivity
{

	private final ClientFactory clientFactory;

	/**
	 *
	 */
	public DayActivity(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;

	}

	@Override
	public void start(AcceptsOneWidget panel, final EventBus eventBus)
	{
		DayView view = clientFactory.getDayView();

		DayPresenter presenter = new DayPresenter();
		presenter.setClientFactory(clientFactory);

		view.setPresenter(presenter);

		panel.setWidget(view);
	}
}