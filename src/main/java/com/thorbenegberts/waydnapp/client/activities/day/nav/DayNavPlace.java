package com.thorbenegberts.waydnapp.client.activities.day.nav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * @author thorbenegberts
 */
public class DayNavPlace extends Place
{
	public static class DayNavPlaceTokenizer implements PlaceTokenizer<DayNavPlace>
	{
		@Override
		public DayNavPlace getPlace(String token)
		{
			return new DayNavPlace();
		}

		@Override
		public String getToken(DayNavPlace place)
		{
			return "day_nav";
		}
	}
}