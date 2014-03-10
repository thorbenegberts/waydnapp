package com.thorbenegberts.waydnapp.client.activities.day;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * @author thorbenegberts
 */
public class DayPlace extends Place
{
	public static class DayPlaceTokenizer implements PlaceTokenizer<DayPlace>
	{
		@Override
		public DayPlace getPlace(String token)
		{
			return new DayPlace();
		}

		@Override
		public String getToken(DayPlace place)
		{
			return "day";
		}
	}
}