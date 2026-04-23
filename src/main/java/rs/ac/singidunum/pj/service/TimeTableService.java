package rs.ac.singidunum.pj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import rs.ac.singidunum.pj.entity.TimeTable;
import rs.ac.singidunum.pj.repo.TimeTableRepository;

@Service
@RequiredArgsConstructor
public class TimeTableService {
    private final TimeTableRepository repository;
    private final MovieService movieService;

    public List<TimeTable> getAll() {
        List<TimeTable> timeTables = repository.findAllByDeletedAtIsNull();

        for (TimeTable t : timeTables) {
            t.setMovie(movieService.getById(t.getMovieId()).get());
        }

        return timeTables;
    }
}
