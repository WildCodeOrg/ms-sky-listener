package org.skyhigh.msskylistener.model.BusinessObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Track {
    private UUID trackId;
    private String performer;
    private String trackName;
    private byte[] playlistPhoto;
}
