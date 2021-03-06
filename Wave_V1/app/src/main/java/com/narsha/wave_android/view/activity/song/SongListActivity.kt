package com.narsha.wave_android.view.activity.song

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.narsha.wave_android.R
import com.narsha.wave_android.data.SongList
import com.narsha.wave_android.data.Songs
import com.narsha.wave_android.data.response.music.Song
import com.narsha.wave_android.network.Server
import com.narsha.wave_android.network.ServerAPI
import com.narsha.wave_android.view.adapter.recyclerview.SongListAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class SongListActivity : AppCompatActivity() {

    lateinit var server : Server
    lateinit var songs : List<Song>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_list)

        /*var listId = intent.getStringExtra("ListId").toInt()

        val adapter = SongListAdapter(songs)

        server = Server.getInstance()
        server.api.songList.enqueue(
                object : Callback<ArrayList<SongList>>{
                    override fun onResponse(call: Call<ArrayList<SongList>>, response: Response<ArrayList<SongList>>) {
                        for(i in 0..response.body()?.size!!){
                            if(response.body()?.get(i)?.playlistid  == listId){
                                songs = response.body()?.get(i)!!.songs
                                adapter.notifyDataSetChanged()

                            }
                        }
                    }

                    override fun onFailure(call: Call<ArrayList<SongList>>, t: Throwable) {
                    }
                }
        )*/
    }
}