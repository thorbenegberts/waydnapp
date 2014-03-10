package com.thorbenegberts.waydnapp.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.thorbenegberts.waydnapp.client.activities.day.DayView;
import com.thorbenegberts.waydnapp.client.activities.day.add.DayAddView;
import com.thorbenegberts.waydnapp.client.activities.day.nav.DayNavView;
import com.thorbenegberts.waydnapp.client.activities.home.HomeView;
import com.thorbenegberts.waydnapp.client.activities.home.nav.HomeNavView;

public interface ClientFactory
{
	public EventBus getEventBus();

	public PlaceController getPlaceController();

	public DayAddView getDayAddView();

	public HomeNavView getHomeNavView();

	public HomeView getHomeView();

	public DayView getDayView();

	public DayNavView getDayNavView();
}