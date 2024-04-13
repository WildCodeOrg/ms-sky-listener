package org.skyhigh.msskylistener.model.BusinessObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class ListenerPerformerPreferences {
    private UUID userID;
    private String[] performersID;
}
