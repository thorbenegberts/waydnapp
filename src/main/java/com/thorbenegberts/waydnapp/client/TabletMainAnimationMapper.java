package com.thorbenegberts.waydnapp.client;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import com.thorbenegberts.waydnapp.client.activities.day.DayPlace;
import com.thorbenegberts.waydnapp.client.activities.day.add.DayAddPlace;
import com.thorbenegberts.waydnapp.client.activities.home.nav.HomeNavPlace;

public class TabletMainAnimationMapper implements AnimationMapper
{
	@Override
	public Animation getAnimation(Place oldPlace, Place newPlace)
	{
		if(oldPlace instanceof DayAddPlace && newPlace instanceof DayPlace)
		{
			return Animation.SLIDE_REVERSE;
		}

		if(oldPlace instanceof DayPlace && newPlace instanceof HomeNavPlace)
		{
			return Animation.SLIDE_REVERSE;
		}

		return Animation.SLIDE;
	}
}