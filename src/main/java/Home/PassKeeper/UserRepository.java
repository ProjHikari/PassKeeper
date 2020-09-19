package Home.PassKeeper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getUsers(){
        String sql = "SELECT * FROM PASS_USERS";

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) ->
                        new User(
                                rs.getInt("ID"),
                                rs.getString("NAME"),
                                rs.getString("ACC_NAME"),
                                rs.getString("ACC_PASS")
                        )
        );
    }
}
