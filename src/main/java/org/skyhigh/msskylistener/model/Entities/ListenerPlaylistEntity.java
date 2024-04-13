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
@Table(name = "listener_playlist")
public class ListenerPlaylistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "playlist_id")
    private String playlistId;

    @Column(name = "playlist_name")
    private String playlistName;

    @Lob
    @Column(name = "playlist_photo")
    private byte[] playlistPhoto;
}
