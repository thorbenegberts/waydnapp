package com.thorbenegberts.waydnapp.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.thorbenegberts.waydnapp.client.activities.day.DayPlace;
import com.thorbenegberts.waydnapp.client.activities.day.nav.DayNavActivity;
import com.thorbenegberts.waydnapp.client.activities.home.nav.HomeNavActivity;
import com.thorbenegberts.waydnapp.client.activities.home.nav.HomeNavPlace;

public class TabletNavActivityMapper implements ActivityMapper
{
	private final ClientFactory clientFactory;

	public TabletNavActivityMapper(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place)
	{
		if(place instanceof HomeNavPlace)
		{
			return new HomeNavActivity(this.clientFactory);
		}

		if(place instanceof DayPlace)
		{
			return new DayNavActivity(this.clientFactory);
		}

		return null;
	}
}
