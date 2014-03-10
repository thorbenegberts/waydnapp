package com.thorbenegberts.waydnapp.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.thorbenegberts.waydnapp.client.activities.day.DayView;
import com.thorbenegberts.waydnapp.client.activities.day.DayViewImpl;
import com.thorbenegberts.waydnapp.client.activities.day.add.DayAddView;
import com.thorbenegberts.waydnapp.client.activities.day.add.DayAddViewImpl;
import com.thorbenegberts.waydnapp.client.activities.day.nav.DayNavView;
import com.thorbenegberts.waydnapp.client.activities.day.nav.DayNavViewImpl;
import com.thorbenegberts.waydnapp.client.activities.home.HomeView;
import com.thorbenegberts.waydnapp.client.activities.home.HomeViewImpl;
import com.thorbenegberts.waydnapp.client.activities.home.nav.HomeNavView;
import com.thorbenegberts.waydnapp.client.activities.home.nav.HomeNavViewImpl;

/**
 * @author thorbenegberts
 */
public class ClientFactoryImpl implements ClientFactory
{
	private EventBus eventBus;
	private PlaceController placeController;
	private DayAddView dayAddView;
	private HomeNavView homeNavView;
	private DayView dayView;
	private HomeView homeView;
	private DayNavView dayNavView;

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
	public HomeNavView getHomeNavView()
	{
		if(homeNavView == null)
		{
			homeNavView = new HomeNavViewImpl();
		}

		return homeNavView;
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

	@Override
	public DayView getDayView()
	{
		if(dayView == null)
		{
			dayView = new DayViewImpl();
		}

		return dayView;
	}

	@Override
	public DayNavView getDayNavView()
	{
		if(dayNavView == null)
		{
			dayNavView = new DayNavViewImpl();
		}

		return dayNavView;
	}
}