package com.thorbenegberts.waydnapp.client.activities.home;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.thorbenegberts.waydnapp.client.ClientFactory;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddPresenter;

/**
 * @author thorbenegberts
 */
public class HomeActivity extends MGWTAbstractActivity
{

	private final ClientFactory clientFactory;

	/**
	 *
	 */
	public HomeActivity(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, final EventBus eventBus)
	{
		HomeView view = clientFactory.getHomeView();

		HomePresenter presenter = new HomePresenter();
		presenter.setClientFactory(clientFactory);

		view.setPresenter(presenter);

		panel.setWidget(view);
	}
}