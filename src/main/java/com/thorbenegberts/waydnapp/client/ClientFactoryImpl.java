package com.thorbenegberts.waydnapp.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddView;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddViewImpl;
import com.thorbenegberts.waydnapp.client.activities.home.HomeView;
import com.thorbenegberts.waydnapp.client.activities.home.HomeViewImpl;

/**
 * @author thorbenegberts
 */
public class ClientFactoryImpl implements ClientFactory
{
	private EventBus eventBus;
	private PlaceController placeController;
	private DayAddView dayAddView;
	private HomeViewImpl homeView;

	public ClientFactoryImpl()
	{
		eventBus = new SimpleEventBus();

		placeController = new PlaceController(eventBus);
	}

	@Override
	public EventBus getEventBus()
	{
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController()
	{
		return placeController;
	}

	@Override
	public DayAddView getDayAddView()
	{
		if(dayAddView == null)
		{
			dayAddView = new DayAddViewImpl();
		}

		return dayAddView;
	}

	@Override
	public HomeView getHomeView()
	{
		if(homeView == null)
		{
			homeView = new HomeViewImpl();
		}

		return homeView;
	}
}