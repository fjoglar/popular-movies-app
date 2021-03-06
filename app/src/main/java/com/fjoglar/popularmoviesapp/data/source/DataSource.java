/*
 * Copyright 2018 Felipe Joglar Santos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fjoglar.popularmoviesapp.data.source;

import com.fjoglar.popularmoviesapp.data.model.Movie;
import com.fjoglar.popularmoviesapp.data.model.Review;
import com.fjoglar.popularmoviesapp.data.model.Video;

import java.util.List;

import io.reactivex.Observable;

public interface DataSource {

    Observable<List<Movie>> getPopularMovies();

    Observable<List<Movie>> getTopRatedMovies();

    Observable<List<Movie>> getFavoriteMovies();

    Observable<Movie> getFavoriteMovieById(int movieId);

    Observable<List<Review>> getMovieReviews(int movieId);

    Observable<List<Video>> getMovieVideos(int movieId);

    Observable<Boolean> saveMovieAsFavorite(Movie movie);

    Observable<Boolean> deleteMovieFromFavorites(int movieId);
}