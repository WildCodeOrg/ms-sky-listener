package org.skyhigh.msskylistener.model.DTO.getUserPlaylists;

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
public class DeliveryRequestGetUserPlaylistsDTO {
    @NotEmpty
    UUID userID;
}
