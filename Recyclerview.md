//Working with Recyclerview
 RecyclerView is a view to list view items 
To work with recyclerview, we need data to populate the view item.

The data can come from any souce, thus either database, localstorage or some sort of an external API.

The view is those will will design to be held in our recyclerview. However,, this view should then 
hold our data or be populated with our data.

To populate our view and data we will need an adapter to bind the view and the data together.


// 

Views:
	Recyclerview
		Item View

Data:
	DataSource
		Data Model

Adapter
	RecyclerAdapter
		DataSource
		CustomClass
			Itemview

Activity
	RecyclerView
	Adapter
	LayoutManager

