package sk.denis.davidek.androidkotlinsample

import android.util.Log
import java.net.URL

/**
 * Created by denisdavidek on 1/31/18.
 */
class Request(private val url: String) {

    fun run() {
        val forecastJSONString = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJSONString)
    }
}