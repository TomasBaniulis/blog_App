package lt.code.academy.blog_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends User {
    private UUID id;
    private String text;
    private LocalDate date;
}
