package org.skyhigh.msskylistener.model.BusinessObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ListenerPlaylistTracks {
    private String playlistID;
    private String trackID;
    private int inPlaylistPosition;
}
