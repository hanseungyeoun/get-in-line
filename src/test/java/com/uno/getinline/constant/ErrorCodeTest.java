package com.uno.getinline.constant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ErrorCodeTest {

    @DisplayName("예외를 받으면, 예외 메시지가 포함된 메시지 출력력")
    @MethodSource
    @ParameterizedTest(name = "{index} {0}====>{1}")
    public void giveExceptionWithMessage_whenGettingMessage_then_ReturnMessage(ErrorCode sut, String expected) {
        //given
        Exception e = new Exception("This is test message.");
        //when
        String result = sut.getMessage(e);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> giveExceptionWithMessage_whenGettingMessage_then_ReturnMessage() {
        return Stream.of(
                arguments(ErrorCode.OK, "Ok - This is test message."),
                arguments(ErrorCode.BAD_REQUEST, "Bad request - This is test message."),
                arguments(ErrorCode.SPRING_BAD_REQUEST, "Spring-detected bad request - This is test message."),
                arguments(ErrorCode.VALIDATION_ERROR, "Validation error - This is test message."),
                arguments(ErrorCode.INTERNAL_ERROR, "Internal error - This is test message."),
                arguments(ErrorCode.SPRING_INTERNAL_ERROR, "Spring-detected internal error - This is test message."),
                arguments(ErrorCode.DATA_ACCESS_ERROR, "Data access error - This is test message.")

//                arguments(ErrorCode.DATA_ACCESS_ERROR, "Data access error - This is test message.")
        );
    }

    @DisplayName("에러 메시지를 받으면, 해당 에러 메시지로 출력")
    @MethodSource
    @ParameterizedTest(name = "{index} \"{0}\"====> \"{1}\" ")
    public void giveMessage_whenGettingMessage_thenReturnMessage(String input, String expected) {
        //given
        //when
        String result = ErrorCode.INTERNAL_ERROR.getMessage(input);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> giveMessage_whenGettingMessage_thenReturnMessage() {
        return Stream.of(
                arguments(null, ErrorCode.INTERNAL_ERROR.getMessage()),
                arguments("", ErrorCode.INTERNAL_ERROR.getMessage()),
                arguments("   ", ErrorCode.INTERNAL_ERROR.getMessage()),
                arguments("This is test message.", "This is test message.")
        );
    }

    @DisplayName("toString() 호출 포맷")
    @Test
    void givenErrorCode_whenToString_thenReturnsSimplifiedToString() {

        // Given

        // When
        String result = ErrorCode.INTERNAL_ERROR.toString();

        // Then
        assertThat(result).isEqualTo("INTERNAL_ERROR (20000)");
    }
}