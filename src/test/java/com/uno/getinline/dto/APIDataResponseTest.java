package com.uno.getinline.dto;

import com.uno.getinline.constant.ErrorCode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class APIDataResponseTest {

    @Test
    public void test(){
        //given

        //when
        String data = "test data";

        APIDataResponse response = APIDataResponse.of(data);

        //then
        assertThat(response)
                .hasFieldOrPropertyWithValue("success", true)
                .hasFieldOrPropertyWithValue("errorCode", ErrorCode.OK.getCode())
                .hasFieldOrPropertyWithValue("message", ErrorCode.OK.getMessage())
                .hasFieldOrPropertyWithValue("data", data);
    }
}