package com.thorbenegberts.waydnapp.client.activities.day.nav;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.thorbenegberts.waydnapp.client.ClientFactory;

/**
 * @author thorbenegberts
 */
public class DayNavActivity extends MGWTAbstractActivity
{

	private final ClientFactory clientFactory;

	/**
	 *
	 */
	public DayNavActivity(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;

	}

	@Override
	public void start(AcceptsOneWidget panel, final EventBus eventBus)
	{
		DayNavView view = clientFactory.getDayNavView();

		DayNavPresenter presenter = new DayNavPresenter();
		presenter.setClientFactory(clientFactory);

		view.setPresenter(presenter);

		panel.setWidget(view);
	}
}