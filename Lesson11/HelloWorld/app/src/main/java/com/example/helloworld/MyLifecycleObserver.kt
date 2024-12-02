package com.example.helloworld

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLifecycleObserver : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.d("MyObserver", "onCreate event triggered")
    }
    override fun onStart(owner: LifecycleOwner) {
        Log.d("MyObserver", "onStart event triggered")
    }
    override fun onResume(owner: LifecycleOwner) {
        Log.d("MyObserver", "onResume event triggered")
    }
    override fun onPause(owner: LifecycleOwner) {
        Log.d("MyObserver", "onPause event triggered")
    }
    override fun onStop(owner: LifecycleOwner) {
        Log.d("MyObserver", "onStop event triggered")
    }
    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("MyObserver", "onDestroy event triggered")
    }
}
