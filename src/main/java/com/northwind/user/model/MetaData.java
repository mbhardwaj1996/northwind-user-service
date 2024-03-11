package com.northwind.user.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MetaData {
    private String status;
    private String code;
    private String message;
    private String version;
}
