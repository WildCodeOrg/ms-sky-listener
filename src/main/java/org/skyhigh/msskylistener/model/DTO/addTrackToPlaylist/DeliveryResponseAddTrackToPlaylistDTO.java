package org.skyhigh.msskylistener.model.DTO.addTrackToPlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryResponseAddTrackToPlaylistDTO {
    private String message;
    private int addTrackPosition;
}
