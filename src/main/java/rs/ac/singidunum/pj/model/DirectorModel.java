package rs.ac.singidunum.pj.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DirectorModel {
    private Integer directorId;
    private String name;
    private LocalDateTime createdAt;
}
