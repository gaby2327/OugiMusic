package com.example.ougimusic.utilities

import android.icu.text.CaseMap
import android.os.Parcelable
import com.example.ougimusic.Albumes
import com.example.ougimusic.Classes.Album
import com.example.ougimusic.Classes.Artist
import com.example.ougimusic.Classes.Playlist
import com.example.ougimusic.Classes.Song
import java.io.Serializable

class ResponseMessages : Serializable{

    data class PlaylistResponse(
        val status: String,
        val data: List<Playlist>
    )

    data class SongResponse(
        val _id: String,
        val data: Song
    )
  
      data class AlbumResponse(
        val _id: String,
        val data: List<Album>
    )

      data class GenreResponse(
        val status: String,
        val data: List<Song>
      )
      
        data class SongListResponse(
        val _id: String,
        val data: List<Song>
    )

    data class searchResponse(
        val status: String,
        val data: List<Song>

    )

    data class artistResponse(
        val status: String,
        val data: List<Artist>

    )
}