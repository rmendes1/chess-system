package boardgame.exceptions;

import boardgame.Board;
import org.w3c.dom.ls.LSOutput;

public class BoardException extends RuntimeException {
    public static final long serialVersionUID = 1L;

   public BoardException(String msg) {
       super(msg);
   }
}
