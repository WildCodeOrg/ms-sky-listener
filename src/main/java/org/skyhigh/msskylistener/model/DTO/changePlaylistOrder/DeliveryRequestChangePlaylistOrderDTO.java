package org.skyhigh.msskylistener.model.DTO.changePlaylistOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryRequestChangePlaylistOrderDTO {
    private String playlistId;
    private Map<Integer, Integer> changedInPlaylistPositions;
}
