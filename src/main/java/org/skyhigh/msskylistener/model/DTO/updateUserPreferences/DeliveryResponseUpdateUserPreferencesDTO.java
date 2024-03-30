package org.skyhigh.msskylistener.model.DTO.updateUserPreferences;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.model.BusinessObjects.Listener;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryResponseUpdateUserPreferencesDTO {
    private String message;
    private Listener updatedListener;
}
