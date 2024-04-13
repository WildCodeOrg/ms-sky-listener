package org.skyhigh.msskylistener.controller;

import lombok.Getter;
import org.skyhigh.msskylistener.model.BusinessObjects.ListenerPlaylist;
import org.skyhigh.msskylistener.model.DTO.getUserPlaylists.DeliveryRequestGetUserPlaylistsDTO;
import org.skyhigh.msskylistener.model.DTO.getUserPlaylists.DeliveryResponseGetUserPlaylistsDTO;
import org.skyhigh.msskylistener.service.UniversalListenerService;
import org.skyhigh.msskylistener.validation.SpringAspect.annotationsApi.ValidParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Logger;

@Getter
@RestController
public class ListenerController {
    private static final Logger log = Logger.getLogger(ListenerController.class.getName());
    private final UniversalListenerService universalListenerService;

    @Autowired
    public ListenerController(UniversalListenerService universalListenerService) {
        this.universalListenerService = universalListenerService;
    }

    @ValidParams
    @GetMapping(value = "/listeners/{userId}/playlists")
    public ResponseEntity<?> getUserPlaylists(@PathVariable("userId") UUID userId, @ValidParams
    @RequestBody DeliveryRequestGetUserPlaylistsDTO getUserByIdDTO){
        log.info("Getting user '" + userId + "'playlists process was started");

        ArrayList<ListenerPlaylist> userPlaylists = universalListenerService.getUserPlaylists(userId);
        return new ResponseEntity<>(new DeliveryResponseGetUserPlaylistsDTO("Плейлисты найдены",
                userPlaylists), HttpStatus.OK);
    }
}
