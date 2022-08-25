package meu.teste.portfoliopresentation.data.di

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit

object DataModule {
    private const val OK_HTTP = "OkHttp"
    private fun networkModules(): Module {
        return module {
            single {
                val interceptor = HttpLoggingInterceptor {
                    Log.e(OK_HTTP, it)
                }
                OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build()
            }
        }
    }

    private inline fun <reified T> createService(): T {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build().create(T::class.java)
    }
}