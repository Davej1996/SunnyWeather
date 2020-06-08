package cool.zhoujie.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "H2fDlUx3QSj4pkSx"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}