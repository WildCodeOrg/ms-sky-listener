package org.skyhigh.msskylistener.model.DTO.deletePlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestDeletePlaylistDTO {
    @NotEmpty
    private String playlistId;
}
