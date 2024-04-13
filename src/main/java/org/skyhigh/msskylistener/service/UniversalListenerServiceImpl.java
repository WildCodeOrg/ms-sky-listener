package org.skyhigh.msskylistener.service;

import org.skyhigh.msskylistener.model.BusinessObjects.ListenerPlaylist;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UniversalListenerServiceImpl implements UniversalListenerService{
    private static final Map<UUID, ListenerPlaylist> LISTENER_PLAYLIST_MAP = new HashMap<>();

    @Override
    public ArrayList<ListenerPlaylist> getUserPlaylists(UUID userID) {
        ArrayList<ListenerPlaylist> ListenerPlaylists = new ArrayList<>(LISTENER_PLAYLIST_MAP.values());
        ArrayList<ListenerPlaylist> userPlaylists = new ArrayList<>();

        for (ListenerPlaylist playlist : ListenerPlaylists)
            if (Objects.equals(playlist.getUserId(), userID)) {
                userPlaylists.add(playlist);
            }
        return userPlaylists;
    }
}
