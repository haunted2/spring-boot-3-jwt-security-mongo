package com.alibou.security.book.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDTO {

    private String id;
    private String author;
    private String isbn;
}
