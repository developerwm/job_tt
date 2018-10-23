package link.obrabo.jobtest.model

import com.google.gson.annotations.SerializedName

class EventResponse(

        @SerializedName("author")
        val author: String,

        @SerializedName("body")
        val status: String
)