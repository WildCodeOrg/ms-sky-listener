package org.skyhigh.msskylistener.model.BusinessObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Listener {
    private String id;
    private ListenerPerformerPreferences performerPreferences;
    private ListenerGenrePreferences genrePreferences;
}
