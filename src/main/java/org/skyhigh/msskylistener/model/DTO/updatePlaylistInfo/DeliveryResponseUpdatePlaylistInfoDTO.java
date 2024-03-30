package org.skyhigh.msskylistener.model.DTO.updatePlaylistInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.model.BusinessObjects.Listener;
import org.skyhigh.msskylistener.model.BusinessObjects.ListenerPlaylist;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryResponseUpdatePlaylistInfoDTO {
    private String message;
    private ListenerPlaylist updatedListenerPlaylist;
}
