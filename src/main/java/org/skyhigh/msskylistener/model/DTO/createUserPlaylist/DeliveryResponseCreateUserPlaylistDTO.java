package org.skyhigh.msskylistener.model.DTO.createUserPlaylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.model.BusinessObjects.ListenerPlaylist;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryResponseCreateUserPlaylistDTO {
    private String message;
    private ListenerPlaylist createdUserPlaylist;
    private UUID[] tracksID;
}
