package exception_handling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowKeyword {

    public static void main(String[] args) throws IOException, SQLException {

        ThrowKeyword throwKeyword = new ThrowKeyword();
        throwKeyword.validate(15);
    }

    private void validate(int i) throws IOException,SQLException {
        if (i < 18) {
            throw new IOException("You can not vote");
        } else {
            throw new SQLException("in a");
        }
    }
}
