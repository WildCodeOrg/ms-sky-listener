package org.skyhigh.msskylistener.model.DTO.updatePlaylistInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.skyhigh.msskylistener.model.BusinessObjects.ListenerGenrePreferences;
import org.skyhigh.msskylistener.model.BusinessObjects.ListenerPerformerPreferences;
import org.skyhigh.msskylistener.validation.annotations.NotEmpty;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryRequestUpdatePlaylistInfoDTO {
    @NotEmpty
    private UUID playlistId;

    private String newPlaylistName;
    private byte[] newPlaylistPhoto;
}
