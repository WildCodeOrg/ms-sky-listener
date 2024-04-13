package org.skyhigh.msskylistener.service;

import org.skyhigh.msskylistener.model.BusinessObjects.ListenerPlaylist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public interface UniversalListenerService {
    /**
     Возвращает список плейлистов пользователя по его идентификатору.
     @param userID - идентификатор пользователя
     @return список плейлистов пользователя*/
    ArrayList<ListenerPlaylist> getUserPlaylists(UUID userID);
}
