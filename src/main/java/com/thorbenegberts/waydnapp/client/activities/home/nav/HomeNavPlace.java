package com.thorbenegberts.waydnapp.client.activities.home.nav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * @author thorbenegberts
 */
public class HomeNavPlace extends Place
{
	public static class HomeNavPlaceTokenizer implements PlaceTokenizer<HomeNavPlace>
	{
		@Override
		public HomeNavPlace getPlace(String token)
		{
			return new HomeNavPlace();
		}

		@Override
		public String getToken(HomeNavPlace place)
		{
			return "home_nav";
		}
	}
}