package info.fandroid.navkotlin

import android.app.Application
import info.fandroid.navkotlin.model.UsersService

class App : Application() {

    val usersService = UsersService()
}