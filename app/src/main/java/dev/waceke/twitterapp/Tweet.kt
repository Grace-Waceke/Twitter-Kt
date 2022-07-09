package dev.waceke.twitterapp

import android.view.contentcapture.DataShareRequest
import org.w3c.dom.Comment

data class Tweet(
    var name: String,
    var handle: String,
    var tweet: String,
    var number1: String,
    var number2: String,
    var number3: String,
    var ivComment: String,
    var ivRetweet: String,
    var ivLike: String,
    var ivShareRequest: String,
    )
