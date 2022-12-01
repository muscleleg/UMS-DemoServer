package com.okestro.ums.dto;

import com.okestro.ums.domain.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    private boolean success;
    private int code;
    private String msg;
    private Object data;


    public static ResponseDto createResponseEntity(boolean success, Object data) {
        ResponseDto responseDto = new ResponseDto();
        if (success) {
            responseDto.setSuccess(true);
            responseDto.setCode(StatusEnum.OK.getStatusCode());
            responseDto.setMsg("성공하였습니다.");
            responseDto.setData(data);
        } else {
            responseDto.setSuccess(false);
            responseDto.setCode(StatusEnum.UNDEFINED.getStatusCode());
            responseDto.setMsg("실패하였습니다.");
        }
        return responseDto;


    }
}
