package com.example.versionok

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lorentzos.flingswipe.SwipeFlingAdapterView
import kotlinx.android.synthetic.main.activity_tinder_component.*
import kotlinx.android.synthetic.main.item.*
import java.util.ArrayList

class tinderComponent : AppCompatActivity() {

    private var array: ArrayList<Data>? = null
    lateinit var myAppAdapter: MyAppAdapter
    lateinit var viewHolder: ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinder_component)

        array = ArrayList()
        array!!.add(Data("http://www.androidtutorialpoint.com/wp-content/uploads/2016/11/Katrina-Kaif.jpg", "HHi I am Katrina Kaif. Wanna chat with me ?. \\n\" + \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.i I am Katrina Kaif. Wanna chat with me ?. \n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        array!!.add(Data("http://www.androidtutorialpoint.com/wp-content/uploads/2016/11/Emma-Watson.jpg", "Hi I am Emma Watson. Wanna chat with me ? \n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        array!!.add(Data("http://www.androidtutorialpoint.com/wp-content/uploads/2016/11/Scarlett-Johansson.jpg", "Hi I am Scarlett Johansson. Wanna chat with me ? \n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        array!!.add(Data("http://www.androidtutorialpoint.com/wp-content/uploads/2016/11/Priyanka-Chopra.jpg", "Hi I am Priyanka Chopra. Wanna chat with me ? \n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        array!!.add(Data("http://www.androidtutorialpoint.com/wp-content/uploads/2016/11/Deepika-Padukone.jpg", "Hi I am Deepika Padukone. Wanna chat with me ? \n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        array!!.add(Data("http://www.androidtutorialpoint.com/wp-content/uploads/2016/11/Anjelina-Jolie.jpg", "Hi I am Anjelina Jolie. Wanna chat with me ? \n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        array!!.add(Data("http://www.androidtutorialpoint.com/wp-content/uploads/2016/11/Aishwarya-Rai.jpg", "Hi I am Aishwarya Rai. Wanna chat with me ? \n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))


        myAppAdapter = MyAppAdapter(array!!, this@tinderComponent)
        frame!!.adapter = myAppAdapter
        frame!!.setFlingListener(object : SwipeFlingAdapterView.onFlingListener {
            override fun removeFirstObjectInAdapter() {

            }

            override fun onLeftCardExit(dataObject: Any) {
                array!!.removeAt(0)
                myAppAdapter.notifyDataSetChanged()
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
            }

            override fun onRightCardExit(dataObject: Any) {

                array!!.removeAt(0)
                myAppAdapter.notifyDataSetChanged()
            }

            override fun onAdapterAboutToEmpty(itemsInAdapter: Int) {

            }

            override fun onScroll(scrollProgressPercent: Float) {

                val view = frame!!.selectedView
                background.alpha = 0f
                item_swipe_right_indicator.setAlpha(
                    if (scrollProgressPercent < 0)
                        -scrollProgressPercent
                    else 0F)
                item_swipe_left_indicator.setAlpha(
                    if (scrollProgressPercent > 0)
                        scrollProgressPercent
                    else 0F
                )
            }
        })


        // Optionally add an OnItemClickListener
        frame!!.setOnItemClickListener { itemPosition, dataObject ->
            val view = frame!!.selectedView
            background.alpha = 0f

            myAppAdapter.notifyDataSetChanged()
        }


    }

    class ViewHolder {
        var DataText: TextView? = null
        var cardImage: ImageView? = null
        var background: FrameLayout? = null
    }

    inner class MyAppAdapter(var parkingList: List<Data>, var context: Context) : BaseAdapter() {
        /**
         * Get a View that displays the data at the specified position in the data set. You can either
         * create a View manually or inflate it from an XML layout file. When the View is inflated, the
         * parent View (GridView, ListView...) will apply default layout parameters unless you use
         * [android.view.LayoutInflater.inflate]
         * to specify a root view and to prevent attachment to the root.
         *
         * @param position The position of the item within the adapter's data set of the item whose view
         * we want.
         * @param convertView The old view to reuse, if possible. Note: You should check that this view
         * is non-null and of an appropriate type before using. If it is not possible to convert
         * this view to display the correct data, this method can create a new view.
         * Heterogeneous lists can specify their number of view types, so that this View is
         * always of the right type (see [.getViewTypeCount] and
         * [.getItemViewType]).
         * @param parent The parent that this view will eventually be attached to
         * @return A View corresponding to the data at the specified position.
         */
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var rowView: View? = convertView


            if (rowView == null) {

                val inflater = layoutInflater
                rowView = inflater.inflate(R.layout.item, parent, false)
                // configure view holder
                viewHolder = ViewHolder()
                viewHolder.DataText = rowView!!.findViewById(R.id.bookText) as TextView
                viewHolder.background = rowView.findViewById(R.id.background) as FrameLayout
                viewHolder.cardImage = rowView.findViewById(R.id.cardImage) as ImageView
                rowView.tag = viewHolder

            } else {
                viewHolder = convertView!!.tag as ViewHolder
            }
            viewHolder.DataText!!.text = parkingList[position].description + ""

            Glide.with(this@tinderComponent).load(parkingList[position].imagePath).into(viewHolder.cardImage!!)

            return rowView
        }

        override fun getCount(): Int {
            return parkingList.size
        }

        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

    }
}
