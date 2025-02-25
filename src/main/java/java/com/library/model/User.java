package java.com.library.model;

import java.com.library.enums.UserRole;

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
@Table(name = "users")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false,unique = true)
  private String email;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private UserRole role;

  @Column(name = "join_date", updatable = false)
  private final LocalDateTime joinDate = LocalDateTime.now();
}
