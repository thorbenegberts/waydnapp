package com.thorbenegberts.waydnapp.client.activities.day;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * @author thorbenegberts
 */
public class DayAddPlace extends Place
{
	public static class DayAddTokenizer implements PlaceTokenizer<DayAddPlace>
	{
		@Override
		public DayAddPlace getPlace(String token)
		{
			return new DayAddPlace();
		}

		@Override
		public String getToken(DayAddPlace place)
		{
			return "day_add";
		}
	}
}