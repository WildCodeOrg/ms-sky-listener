package org.skyhigh.msskylistener.model.DTO.getPlaylistTracks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryRequestGetPlaylistTracksDTO {
    @NotEmpty
    private String userMadeRequestId;
    @NotEmpty
    private String playlistId;
}
