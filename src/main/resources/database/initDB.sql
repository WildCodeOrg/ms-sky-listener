SET FOREIGN_KEY_CHECKS=0;

/* Create Tables */
CREATE TABLE IF NOT EXISTS listener_genre_preferences
(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id VARCHAR(36) NOT NULL,
    genre_key VARCHAR(36) NOT NULL,
    CONSTRAINT PK_listener_genre_preferences PRIMARY KEY (id ASC)
);

CREATE TABLE IF NOT EXISTS listener_performer_preferences
(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id VARCHAR(36) NOT NULL,
    performer_id VARCHAR(36) NOT NULL,
    CONSTRAINT PK_listener_performer_preferences PRIMARY KEY (id ASC)
);

CREATE TABLE IF NOT EXISTS listener_playlist
(
    playlist_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id VARCHAR(36) NOT NULL,
    playlist_name VARCHAR(30) NOT NULL,
    playlist_photo MEDIUMBLOB NULL,
    CONSTRAINT PK_listener_playlist PRIMARY KEY (playlist_id ASC)
);

CREATE TABLE IF NOT EXISTS listener_playlist_track
(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    playlist_id INT UNSIGNED NOT NULL,
    track_id VARCHAR(36) NOT NULL,
    in_playlist_position SMALLINT UNSIGNED NOT NULL,
    CONSTRAINT PK_listener_playlist_track PRIMARY KEY (id ASC)
);

/* Drop Foreign Key Constraints if they exist*/
ALTER TABLE listener_playlist_track
    DROP CONSTRAINT FK_listener_playlist_track_listener_playlist;

/* Create Foreign Key Constraints */
ALTER TABLE listener_playlist_track
    ADD CONSTRAINT FK_listener_playlist_track_listener_playlist
        FOREIGN KEY (playlist_id) REFERENCES listener_playlist (`playlist_id`) ON DELETE Restrict ON UPDATE Restrict;

SET FOREIGN_KEY_CHECKS=1;
