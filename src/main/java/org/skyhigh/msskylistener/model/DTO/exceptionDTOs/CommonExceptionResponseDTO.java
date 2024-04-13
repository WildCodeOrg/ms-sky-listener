package org.skyhigh.msskylistener.model.DTO.exceptionDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CommonExceptionResponseDTO {
    private int code;
    private String description;
    private int httpCode;
    private String message;
}
