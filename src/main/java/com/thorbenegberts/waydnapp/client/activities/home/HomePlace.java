package com.thorbenegberts.waydnapp.client.activities.home;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * @author thorbenegberts
 */
public class HomePlace extends Place
{
	public static class HomePlaceTokenizer implements PlaceTokenizer<HomePlace>
	{
		@Override
		public HomePlace getPlace(String token)
		{
			return new HomePlace();
		}

		@Override
		public String getToken(HomePlace place)
		{
			return "home";
		}
	}
}