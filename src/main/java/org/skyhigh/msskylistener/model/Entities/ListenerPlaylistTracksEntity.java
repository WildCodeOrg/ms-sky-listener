package org.skyhigh.msskylistener.model.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "listener_playlist_tracks")
public class ListenerPlaylistTracksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "playlist_id")
    private String playlistId;

    @Column(name = "track_id")
    private String trackId;

    @Column(name = "in_playlist_position")
    private int inPlaylistPosition;
}
