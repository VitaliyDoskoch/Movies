package com.extensions.retrofit.components.handlerProviders

import io.reactivex.Single
import io.reactivex.functions.Function
import retrofit2.Response

interface ResponseHandlerProvider {

    fun <R : Response<*>> provideHandler(): Function<R, Single<R>>

}