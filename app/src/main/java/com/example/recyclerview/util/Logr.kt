package com.example.recyclerview.util

import android.util.Log

object Logr {
    const val MAX_MESSAGE = 4000
    const val MAX_TAG = 300
    fun d(tag: String, msg: String) {
        if (msg.length > MAX_TAG && tag.length > MAX_MESSAGE) {
            Log.d(tag.substring(0, MAX_TAG), msg.substring(0, MAX_MESSAGE))
            Logr.d(tag.substring(MAX_TAG), msg.substring(MAX_MESSAGE))
        } else if (msg.length > MAX_MESSAGE) {
            Log.d(tag, msg.substring(0, MAX_MESSAGE))
            Logr.d(tag, msg.substring(MAX_MESSAGE))
        } else if (tag.length > MAX_TAG) {
            Log.d(tag.substring(0, MAX_TAG), msg)
            Logr.d(tag.substring(MAX_TAG), msg)
        } else {
            Log.d(tag, msg)
        }
    }
}