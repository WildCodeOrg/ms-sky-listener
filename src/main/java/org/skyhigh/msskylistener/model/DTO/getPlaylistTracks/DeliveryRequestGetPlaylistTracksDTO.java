package org.skyhigh.msskylistener.model.DTO.getPlaylistTracks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryRequestGetPlaylistTracksDTO {
    @NotEmpty
    private UUID userMadeRequestId;
    @NotEmpty
    private UUID playlistId;
}
