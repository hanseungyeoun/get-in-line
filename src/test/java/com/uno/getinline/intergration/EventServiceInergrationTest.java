package com.uno.getinline.intergration;

import com.uno.getinline.dto.EventDto;
import com.uno.getinline.service.EventService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EventServiceInergrationTest {

    @Autowired private EventService sut;

    @DisplayName("검색 조건 없이 이벤트를 검색하면, 전체 결과를 출력하여 보여준다.")
    @Test
    void givenNothing_whenSearchingEvents_thenReturnsEntireEventList() throws Exception {
        // when
//        List<EventDto> list = sut.getEvents(null, null, null, null, null);
//
//        // then
//        assertThat(list).hasSize(0);
    }
}
