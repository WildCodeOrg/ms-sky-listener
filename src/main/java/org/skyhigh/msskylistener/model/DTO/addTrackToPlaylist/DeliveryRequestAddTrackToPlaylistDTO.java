package org.skyhigh.msskylistener.model.DTO.addTrackToPlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestAddTrackToPlaylistDTO {
    @NotEmpty
    private UUID playlistId;
    @NotEmpty
    private UUID trackId;
}
