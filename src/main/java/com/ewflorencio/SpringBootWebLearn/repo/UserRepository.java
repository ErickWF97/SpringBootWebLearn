package com.ewflorencio.SpringBootWebLearn.repo;

import com.ewflorencio.SpringBootWebLearn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<User> findAll() {

        return jdbc.query("SELECT * FROM usuario", (rs, rowNum) -> {

            User u = new User();

            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setEmail(rs.getString("email"));
            u.setLogin(rs.getString("login"));
            u.setPassword(rs.getString("password"));

            return u;
        });
    }

}
