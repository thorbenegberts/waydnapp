package com.thorbenegberts.waydnapp.client.activities.home.nav;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.thorbenegberts.waydnapp.client.ClientFactory;

/**
 * @author thorbenegberts
 */
public class HomeNavActivity extends MGWTAbstractActivity
{

	private final ClientFactory clientFactory;

	/**
	 *
	 */
	public HomeNavActivity(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, final EventBus eventBus)
	{
		HomeNavView view = clientFactory.getHomeNavView();

		HomeNavPresenter presenter = new HomeNavPresenter();
		presenter.setClientFactory(clientFactory);

		view.setPresenter(presenter);

		panel.setWidget(view);
	}
}