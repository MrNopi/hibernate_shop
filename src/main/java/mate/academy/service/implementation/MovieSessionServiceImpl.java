package mate.academy.service.implementation;

import java.util.List;
import mate.academy.dao.MovieSessionDao;
import mate.academy.lib.Inject;
import mate.academy.model.MovieSession;
import mate.academy.service.MovieSessionService;

public class MovieSessionServiceImpl implements MovieSessionService {
    @Inject
    private MovieSessionDao movieSessionDao;

    @Override
    public MovieSession add(MovieSession movieSession) {
        return movieSessionDao.add(movieSession);
    }

    @Override
    public List<MovieSession> getAll() {
        return movieSessionDao.getAll();
    }
}
