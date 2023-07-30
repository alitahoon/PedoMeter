package com.example.pedometer.ui

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pedometer.util.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor():ViewModel(){
    var btnGetStartedClicked=SingleLiveEvent<Boolean>()




    fun onBtnGetStartedClicked(view: View){
        btnGetStartedClicked.value=true
    }
}