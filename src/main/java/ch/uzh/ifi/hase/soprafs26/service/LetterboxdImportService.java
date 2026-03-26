package ch.uzh.ifi.hase.soprafs26.service;

import ch.uzh.ifi.hase.soprafs26.entity.User;
import ch.uzh.ifi.hase.soprafs26.rest.dto.LetterboxdImportResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class LetterboxdImportService {
    public LetterboxdImportResponse importZip(User user, MultipartFile file) throws IOException {
        // TODO:
        //   1. validate zip
        //   2. unzip
        //   3. import/overwrite current user's Letterboxd data
        //   4. compute stats
        //   5. return updated user payload
        LetterboxdImportResponse response = new LetterboxdImportResponse();
        LetterboxdImportResponse.Stats stats = new LetterboxdImportResponse.Stats();

        response.setId(user.getId());
        response.setUsername(user.getUsername());
        response.setHasLetterboxdData(true);

        stats.setMoviesLogged(1);
        stats.setHighlyRatedMovies(1);
        stats.setTopGenres(Arrays.asList("Foo", "Bar", "Foobar"));
        response.setStats(stats);
        return response;
    }
}
