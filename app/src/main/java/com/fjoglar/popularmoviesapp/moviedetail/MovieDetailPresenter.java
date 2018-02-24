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

package com.fjoglar.popularmoviesapp.moviedetail;

import android.support.annotation.NonNull;

import com.fjoglar.popularmoviesapp.data.model.Movie;

public class MovieDetailPresenter implements MovieDetailContract.Presenter {

    @NonNull
    private final MovieDetailContract.View mMovieDetailView;

    private final Movie mMovie;

    public MovieDetailPresenter(@NonNull MovieDetailContract.View movieDetailView, Movie movie) {
        mMovieDetailView = movieDetailView;
        mMovie = movie;

        mMovieDetailView.setPresenter(this);
    }

    @Override
    public void subscribe() {
        mMovieDetailView.showLoading();
        getMovie();
        mMovieDetailView.hideLoading();
    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void getMovie() {
        mMovieDetailView.showMovie(mMovie);
    }
}