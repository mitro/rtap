'use strict';

var gulp = require('gulp'),
    browserify = require('gulp-browserify'),
    clean = require('gulp-clean'),
    size = require('gulp-size'),
    stylus = require('gulp-stylus'),
    babelify = require('babelify'),
    envify = require('envify/custom');

gulp.task('clean', function() {
    return gulp
        .src(['./public/scripts/index.js'], {read: false})
        .pipe(clean());
});

gulp.task('js', function() {
    return gulp
        .src('./app/index.js')
        .pipe(browserify({transform: ['babelify', 'envify']}))
        .pipe(gulp.dest('./public/scripts'))
        .pipe(size());
});

gulp.task('css', function() {
    gulp
        .src('./styles/*.styl')
        .pipe(stylus({
            'include css': true
        }))
        .pipe(gulp.dest('./public/styles'));
});

gulp.task('watch', function(cb) {
    gulp.watch('app/**/*.*', ['js']);
    gulp.watch('styles/**/*.*', ['css']);

    console.log('Watching files for changes...')
});

gulp.task('default', ['clean', 'js', 'css'], function() {});