package org.skyhigh.msskylistener.model.DTO.getUserPlaylists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.skyhigh.msskylistener.model.BusinessObjects.ListenerPlaylist;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryResponseGetUserPlaylistsDTO {
    private String message;
    private List<ListenerPlaylist> listenerPlaylist;
}
