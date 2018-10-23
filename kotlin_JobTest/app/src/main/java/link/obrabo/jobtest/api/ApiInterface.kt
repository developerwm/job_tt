package link.obrabo.jobtest.api

import link.obrabo.jobtest.model.EventResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    // =========================
    @GET("http://trdeveloper.hol.es/git_return.php")
    fun events():Call<ArrayList<EventResponse>>

}