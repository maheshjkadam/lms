package java.com.library.model;

import java.com.library.enums.BookStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String author;

  @Column(nullable = false,unique = true)
  private String isbn;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private BookStatus status;

  @Column(name = "added_date",updatable = false)
  private final LocalDateTime addedDate = LocalDateTime.now();
}
