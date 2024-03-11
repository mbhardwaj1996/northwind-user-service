package com.northwind.user.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomResponseModel {
    private MetaData metaData;
    private ResourceData resourceData;
}
