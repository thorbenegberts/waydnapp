package com.thorbenegberts.waydnapp.client.activities.day;

import com.thorbenegberts.waydnapp.client.ClientFactory;
import com.thorbenegberts.waydnapp.client.Presenter;

/**
 * @author thorbenegberts
 */
public class DayAddPresenter implements Presenter
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
