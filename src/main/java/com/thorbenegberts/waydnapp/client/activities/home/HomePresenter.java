package com.thorbenegberts.waydnapp.client.activities.home;

import com.thorbenegberts.waydnapp.client.ClientFactory;
import com.thorbenegberts.waydnapp.client.Presenter;

/**
 * Created by tegberts on 09.03.14.
 */
public class HomePresenter implements Presenter
{
	private ClientFactory clientFactory;

	@Override
	public void setClientFactory(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;
	}

	@Override
	public ClientFactory getClientFactory()
	{
		return clientFactory;
	}
}