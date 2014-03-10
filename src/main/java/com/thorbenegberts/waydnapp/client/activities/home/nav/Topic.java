package com.thorbenegberts.waydnapp.client.activities.home.nav;

import java.io.Serializable;

/**
 * Created by tegberts on 09.03.14.
 */
public class Topic implements Serializable
{
	/**
	 *
	 */
	private static final long serialVersionUID = -134211444131752658L;

	private String name;

	private int count;

	public Topic() {

	}

	public Topic(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}