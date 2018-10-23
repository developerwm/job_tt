package link.obrabo.jobtest

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import link.obrabo.jobtest.adapter.EventAdapter
import link.obrabo.jobtest.api.ApiClient
import link.obrabo.jobtest.api.ApiInterface
import link.obrabo.jobtest.model.EventResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var eventAdpter: EventAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        iniUI()
    }

    fun iniUI() {
        linearLayoutManager = LinearLayoutManager(null)
        recy.layoutManager = linearLayoutManager

        val apiService = ApiClient.client().create(ApiInterface::class.java)
        // val call = apiService.groups(eventModel!!.evento_id) _id)
        val call = apiService.events()
        call.enqueue(object : Callback<ArrayList<EventResponse>> {
            override fun onResponse(call: Call<ArrayList<EventResponse>>, response: Response<ArrayList<EventResponse>>) {
                var data = response.body()
                //val jsonString = com.google.gson.Gson().toJson(response.body())
                populateList(data!!)
            }
            override fun onFailure(call: Call<ArrayList<EventResponse>>, t: Throwable) {
            }
        })
    }

    fun populateList(data: ArrayList<EventResponse>){
        recy.visibility = View.VISIBLE
        recy.setHasFixedSize(true)
        recy.setNestedScrollingEnabled(false);
        eventAdpter = EventAdapter(data!!, this@MainActivity)
        recy.adapter = eventAdpter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
