package com.alibou.security.api;

import com.alibou.security.book.dto.BookDTO;
import com.alibou.security.book.BookService;
import com.alibou.security.book.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookApi {

    BookService bookService;

    @PostMapping
    public ResponseEntity<?> save(
            @RequestBody BookDTO request
    ) {
        bookService.save(request);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAllBooks(@CurrentSecurityContext CurrentSecurityContext securityContext) {

        return ResponseEntity.ok(bookService.findAll()
        );
    }
}
