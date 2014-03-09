package com.thorbenegberts.waydnapp.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddActivity;
import com.thorbenegberts.waydnapp.client.activities.day.DayAddPlace;

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
		if(place != null)
		{
			if(place instanceof DayAddPlace)
			{
				return new DayAddActivity(this.clientFactory);
			}
		}

		return null;
	}
}
