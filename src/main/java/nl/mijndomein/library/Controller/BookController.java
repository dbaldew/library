package nl.mijndomein.library.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<Object> getAllBooks() {
        return ResponseEntity.ok(...);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Object> getBook(@PathVariable long id) {
        return ResponseEntity.ok(...);
    }

    @GetMapping("/books?title={title}")
    public ResponseEntity<Object> getAllBooks(@RequestParam String title) {
        return ...;
    }

    @PostMapping("/books")
    public ResponseEntity<Object> addBook(@RequestBody String title) {
        ...
        return ResponseEntity.created(...);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Object> deleteBook(@PathVariable int id) {
    ...
        return ResponseEntity.noContent();
    }

    //replace existing item
    @PutMapping("/books/{id}")
    public ResponseEntity<Object> updateBook(@PathVariable int id, @RequestBody String title) {
    ...
        return ResponseEntity.noContent();
    }

    //partial edit
    @PatchMapping("/books/{id}")
    public ResponseEntity<Object> modifyBook(@PathVariable int id, @RequestBody String title) {
    ...
        return ResponseEntity.noContent();
    }







}
