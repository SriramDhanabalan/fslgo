package com.newage.fx.finance.service.client.dto.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ClientPagesResponseDTO<T> {

    private Integer httpStatus;
    private Boolean success;
    private Date timestamp;
    private ResultPagesResponseDTO<T> result;
    private ResponseError error;

    public Date getTimestamp() {

        return Calendar.getInstance().getTime();
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonRootName(value = "result")
    public static class ResultPagesResponseDTO<T> {

        private T content;
        private PageableDTO pageable;
        private boolean last;
        private int totalElements;
        private int totalPages;
        private int size;
        private int number;
        private SortDTO sort;
        private boolean first;
        private int numberOfElements;
        private boolean empty;

        @Getter
        @Setter
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonRootName(value = "pageable")
        public static class PageableDTO {

            private SortDTO sort;
            private int offset;
            private int pageNumber;
            private int pageSize;
            private boolean unpaged;
            private boolean paged;
        }

        @Getter
        @Setter
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonRootName(value = "sort")
        public static class SortDTO {

            private boolean sorted;
            private boolean unsorted;
            private boolean empty;
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonRootName(value = "error")
    public static class ResponseError {

        private String code;

        private List<String> message;

    }
}
