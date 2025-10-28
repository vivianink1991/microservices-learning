package com.eastbytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
public class ResponseDto<T> {

    private String statusCode;

    private String statusMsg;

}
