
package com.thorbenegberts.waydnapp.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.thorbenegberts.waydnapp.client.activities.day.add.DayAddActivity;
import com.thorbenegberts.waydnapp.client.activities.day.add.DayAddPlace;

/**
 * @author thorbenegberts
 */
public class PhoneActivityMapper implements ActivityMapper
{
	private final ClientFactory clientFactory;

	public PhoneActivityMapper(ClientFactory clientFactory)
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
