package boardgame.exceptions;

import org.w3c.dom.ls.LSOutput;

public class BoardException extends RuntimeException {

    private final String msg;

    public BoardException(String msg) {
        this.msg = msg;
    }

    public BoardException(String message, String msg) {
        super(message);
        this.msg = msg;
    }

    public BoardException(String message, Throwable cause, String msg) {
        super(message, cause);
        this.msg = msg;
    }

    public BoardException(Throwable cause, String msg) {
        super(cause);
        this.msg = msg;
    }

    public BoardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String msg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.msg = msg;
    }
}
