package com.thorbenegberts.waydnapp.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddActivity;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddPlace;
import com.thorbenegberts.waydnapp.client.activities.home.HomeActivity;
import com.thorbenegberts.waydnapp.client.activities.home.HomePlace;

public class TabletMainActivityMapper implements ActivityMapper
{
	private final ClientFactory clientFactory;

	public TabletMainActivityMapper(ClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place)
	{
		if(place != null)
		{
			if(place instanceof DayAddPlace)
			{
				return new DayAddActivity(this.clientFactory);
			}

			if(place instanceof HomePlace)
			{
				return new HomeActivity(this.clientFactory);
			}
		}

		return null;
	}
}