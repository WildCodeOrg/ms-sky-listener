package org.skyhigh.msskylistener.model.BusinessObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ListenerPlaylist {
    private String userId;
    private String playlistId;
    private String playlistName;
    private byte[] playlistPhoto;
}
