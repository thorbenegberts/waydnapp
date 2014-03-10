package com.thorbenegberts.waydnapp.client.activities.day.nav;

import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.BasicCell;
import com.googlecode.mgwt.ui.client.widget.celllist.CellListWithHeader;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;
import com.thorbenegberts.waydnapp.client.activities.day.add.DayAddPlace;
import com.thorbenegberts.waydnapp.client.activities.home.nav.Topic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tegberts on 09.03.14.
 */
public class DayNavViewImpl implements DayNavView
{
	private DayNavPresenter presenter;
	private LayoutPanel main;
	private HeaderButton forwardButton;
	private HeaderPanel headerPanel;
	private CellListWithHeader<Topic> cellList;

	public DayNavViewImpl()
	{
		main = new LayoutPanel();

		headerPanel = new HeaderPanel();

		forwardButton = new HeaderButton();
		forwardButton.setForwardButton(true);
		if (MGWT.getOsDetection().isPhone())
		{
			headerPanel.setRightWidget(forwardButton);
		}
		main.add(headerPanel);

		cellList = new CellListWithHeader<Topic>(new BasicCell<Topic>()
		{

			@Override
			public String getDisplayString(Topic model)
			{
				return model.getName();
			}

			@Override
			public boolean canBeSelected(Topic model)
			{
				return true;
			}
		});

		cellList.getCellList().setRound(true);

		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setWidget(cellList);
		scrollPanel.setScrollingEnabledX(false);
		main.add(scrollPanel);

		headerPanel.setCenter("Day");
		forwardButton.setText("forward");


		List<Topic> topicList = new ArrayList<Topic>();
		topicList.add(new Topic("Add day", 0));

		cellList.getCellList().render(topicList);

		cellList.getCellList().addCellSelectedHandler(
				new CellSelectedHandler()
				{
					@Override
					public void onCellSelected(CellSelectedEvent cellSelectedEvent)
					{
						if(cellSelectedEvent.getIndex() == 0)
						{
							getPresenter().getClientFactory().getPlaceController().goTo(new DayAddPlace());
						}
					}
				}
		);
	}

	@Override
	public void setPresenter(DayNavPresenter presenter)
	{
		this.presenter = presenter;
	}

	@Override
	public DayNavPresenter getPresenter()
	{
		return presenter;
	}

	@Override
	public Widget asWidget()
	{
		return main;
	}
}