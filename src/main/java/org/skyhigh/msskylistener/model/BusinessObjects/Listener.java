package org.skyhigh.msskylistener.model.BusinessObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Listener {
    private UUID id;
    private ListenerPerformerPreferences listenerPerformerPreferences;
    private ListenerGenrePreferences listenerGenrePreferences;
    private ArrayList<ListenerPlaylist> listenerPlaylists;
}
