package com.thorbenegberts.waydnapp.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddView;
import com.thorbenegberts.waydnapp.client.activities.home.HomeView;

public interface ClientFactory
{
	public EventBus getEventBus();

	public PlaceController getPlaceController();

	public DayAddView getDayAddView();

	public HomeView getHomeView();
}