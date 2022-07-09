package dev.waceke.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.waceke.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()
    }

    fun displayTweet(){
        var twitter1 = Tweet("Waceke Mwangi", "@waceke", "Why do we call Gucci'Mane',and then call it original", "1045", "37894", "47326363345", "", "", "", "")
        var twitter2 = Tweet("Jane Nyambura", "@ujanita", "Best language for begginers is python or javascript", "1006", "37892", "3453716", "", "", "", "")
        var twitter3 = Tweet("Sammy Maimbo", "@samvantage", "Killing two birds with one stone", "100", "37859", "3454", "", "", "", "")
        var twitter4 = Tweet("Jane Gathoni", "@mamaciiku", "Why did the picture go to jail? Because it was framed", "123100", "37689", "3402821345", "", "", "", "")
        var twitter5 = Tweet("Dylan George", "@dylan", "The best place to buy, sell, and pay with cryptocurrencies", "135768700", "83789", "34363265", "", "", "", "")
        var twitter6 = Tweet("Tamara Waithera", "@tamara", "Didn't know you can host your frontend and backend on heroku", "10455770", "3789789", "3402321385", "", "", "", "")
        var twitter7 = Tweet("Mercy Wanjiku", "@mercy", "When things are going well for you be glad and when trouble comes, just remember God", "1123100", "345783789", "099282345", "", "", "", "")
        var twitter8 = Tweet("Ethan Joseph", "@jose", "Leaving no one behind in the fully connected, intelligent world", "14411", "378678789", "34456645", "", "", "", "")
        var twitter9 = Tweet("Catherine Nderitu", "@keith", "For someone with zero knowledge of tech, trying to transition and jumping html css and javascript", "6778100", "32146667789", "34849439425", "", "", "", "")
        var twitter10 = Tweet("Ian Francis", "@franko", "I love when am handling a situation better than my old self would have", "344903", "3712389", "367898845", "", "", "", "")
        var twitterList = listOf(twitter1, twitter2, twitter3, twitter4, twitter5, twitter6, twitter7, twitter8, twitter9, twitter10)
        var twitterAdapter = TwitterRVAdapter(twitterList)
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = twitterAdapter
    }
}