package sk.denis.davidek.androidkotlinsample

import android.content.Context
import android.widget.Toast

/**
 * Created by denisdavidek on 1/31/18.
 */
class Person(name: String, surname: String) {

    var testName :String = ""
   //get() = testName.toUpperCase()
    /*    set(value) {
           testName = "Name: $value"
       }*/


    init {
    var firstname: String = name
    }

    /*fun add(x: Int, y: Int): Int {
        return x+y
    }*/
    fun add(x: Int, y: Int): Int = x+y


}
