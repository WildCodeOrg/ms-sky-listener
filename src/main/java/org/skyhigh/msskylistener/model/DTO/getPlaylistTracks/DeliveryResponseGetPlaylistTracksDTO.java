package org.skyhigh.msskylistener.model.DTO.getPlaylistTracks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.model.BusinessObjects.Listener;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryResponseGetPlaylistTracksDTO {
    private String message;
    private String[] playlistTracks;
}
