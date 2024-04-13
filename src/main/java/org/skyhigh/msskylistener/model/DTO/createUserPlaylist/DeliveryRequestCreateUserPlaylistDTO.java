package org.skyhigh.msskylistener.model.DTO.createUserPlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestCreateUserPlaylistDTO {
    @NotEmpty
    private UUID userMadeRequestId;
    @NotEmpty
    private String playlistName;

    private byte[] newPlaylistPhoto;
    private String[] newTracksList;
}
