package org.skyhigh.msskylistener.model.DTO.changePlaylistOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestChangePlaylistOrderDTO {
    private UUID playlistId;
    private Map<Integer, Integer> changedInPlaylistPositions;
}
