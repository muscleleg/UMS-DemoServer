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

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    private boolean success;
    private int code;
    private String msg;
    private Object data;


    public static ResponseEntity createResponseEntity(boolean success, Object data) {
        ResponseDto responseDto = new ResponseDto();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        if (success) {
            responseDto.setSuccess(true);
            responseDto.setCode(StatusEnum.UNDEFINED.getStatusCode());
            responseDto.setMsg("성공하였습니다.");
            responseDto.setData(data);
        } else {
            responseDto.setSuccess(false);
            responseDto.setCode(StatusEnum.UNDEFINED.getStatusCode());
            responseDto.setMsg("실패하였습니다.");
        }
        return new ResponseEntity<>(responseDto, httpHeaders, HttpStatus.OK);

    }
}
