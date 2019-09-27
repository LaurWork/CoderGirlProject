package com.codergirl.FirstProj.dao;

import com.codergirl.FirstProj.model.Video;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class VideoRowMapper implements

RowMapper<Video> {

    public Video mapRow(ResultSet resultSet, int x) throws SQLException {

        int id;
        String name;
        String area;
        String webAddress;

        id = resultSet.getInt("ID");
        name = resultSet.getString("NAME");
        area = resultSet.getString("AREA");
        webAddress = resultSet.getString("WEBADDRESS");

        return new Video(id, name, area, webAddress);
    }





}
