package org.skyhigh.msskylistener.model.DTO.addTrackToPlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestAddTrackToPlaylistDTO {
    @NotEmpty
    private String playlistId;
    @NotEmpty
    private String trackId;
}
