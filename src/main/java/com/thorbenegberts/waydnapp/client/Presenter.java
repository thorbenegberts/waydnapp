package com.thorbenegberts.waydnapp.client;

/**
 * @author thorbenegberts
 */
public interface Presenter
{
	public void setClientFactory(ClientFactory clientFactory);
	public ClientFactory getClientFactory();
}