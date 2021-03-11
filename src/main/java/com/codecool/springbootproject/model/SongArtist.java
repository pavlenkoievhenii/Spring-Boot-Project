package com.codecool.springbootproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="song_artist")
public class SongArtist {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="artist_id", nullable=false)
    private Artist artist;

    @ManyToOne
    @JoinColumn(name="song_id", nullable=false)
    private Song song;

    public SongArtist(Artist artist, Song song) {
        this.artist = artist;
        this.song = song;
    }

    public SongArtist() {
    }
}
