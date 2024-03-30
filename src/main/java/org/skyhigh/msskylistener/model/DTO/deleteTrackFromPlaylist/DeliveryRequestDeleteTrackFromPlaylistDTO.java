package org.skyhigh.msskylistener.model.DTO.deleteTrackFromPlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestDeleteTrackFromPlaylistDTO {
    @NotEmpty
    private String playlistId;
    @NotEmpty
    private String trackId;
}
