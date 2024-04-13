package org.skyhigh.msskylistener.model.DTO.deletePlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestDeletePlaylistDTO {
    @NotEmpty
    private UUID playlistId;
}
