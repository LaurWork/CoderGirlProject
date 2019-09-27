package com.codergirl.FirstProj.dao;

import com.codergirl.FirstProj.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class VideoDAO {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Video> getAll () {

        return jdbcTemplate.query("select * from MY_VIDEOS.videos",
                new VideoRowMapper());

    }

    public void addVideo(Video video) {
        System.out.println("Adding " + video);
        jdbcTemplate.update(
                "INSERT INTO MY_VIDEOS.videos(Name, Area, WebAddress) VALUES (?,?,?)",
                video.getName(),
                video.getArea(),
                video.getWebAddress());
    }


            public void updateVideo(int id, Video video) {
        System.out.println("Updating " + video);
        jdbcTemplate.update(
                "UPDATE My_VIDEOS.videos SET name=?, address=? where id=?",
                video.getName(),
                video.getWebAddress(), id);
    }



    public Video findByID(int id) {
        List<Video> matches = jdbcTemplate.query(
                "select * from My_VIDEOS.videos where id = ?",

                new Object [] {id},
                new VideoRowMapper());
        if (matches.isEmpty()){
            return null;
        }

        else {
            return matches.get(0);
        }
    }

}
