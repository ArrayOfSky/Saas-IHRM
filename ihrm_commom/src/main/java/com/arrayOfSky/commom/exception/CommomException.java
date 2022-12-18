package com.arrayOfSky.commom.exception;

import com.arrayOfSky.commom.entity.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommomException extends Exception{

    private ResultCode resultCode;


}
