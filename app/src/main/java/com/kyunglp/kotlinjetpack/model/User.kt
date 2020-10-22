package com.kyunglp.kotlinjetpack.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.kyunglp.kotlinjetpack.BR

/**
 *@author liupeng
 *@version v1.0
 *@date 2020/10/21 8:28 PM
 *@since
 */
class User() : BaseObservable() {
    @get:Bindable
    var name = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
}