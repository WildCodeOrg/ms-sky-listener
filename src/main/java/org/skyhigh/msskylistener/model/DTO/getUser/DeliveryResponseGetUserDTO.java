package org.skyhigh.msskylistener.model.DTO.getUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skyhigh.msskylistener.model.BusinessObjects.Listener;

@Setter
@Getter
@AllArgsConstructor
public class DeliveryResponseGetUserDTO {
    private String message;
    private Listener foundListener;
}
