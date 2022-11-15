package com.okestro.ums.controller;

import com.okestro.ums.domain.Hub;
import com.okestro.ums.domain.StatusEnum;
import com.okestro.ums.domain.User;
import com.okestro.ums.dto.HubDto;
import com.okestro.ums.dto.ResponseDto;
import com.okestro.ums.repository.user.UserRepository;
import com.okestro.ums.service.HubService;
import com.okestro.ums.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.nio.charset.Charset;

@RequiredArgsConstructor
@RestController
public class UmsController {
    private final UserService userService;
    private final HubService hubService;
    @PostMapping("/api/hub")
    public ResponseEntity<ResponseDto> sendHub(@Valid HubDto hubDto, BindingResult bindingResult){
        User findUser = userService.findByUserIdAndUserName(hubDto.getUserId(), hubDto.getUserName());
        if(findUser!=null && !bindingResult.hasErrors()){
            Hub hub = Hub.createHub(hubDto.getMsg(), hubDto.getTitle(), findUser);
            hubService.saveHub(hub);
            return ResponseDto.createResponseEntity(true,hubDto);
        }
        return ResponseDto.createResponseEntity(false,hubDto);
    }

}
