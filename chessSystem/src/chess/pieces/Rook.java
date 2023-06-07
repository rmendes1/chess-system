package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position paux = new Position(0,0);

        // verify if above the piece is possible to move
        paux.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(paux) && !getBoard().thereIsAPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
            paux.setRow(paux.getRow() - 1);
        }

        if (getBoard().positionExists(paux) && isThereOpponentPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
        }

        // verify left
        paux.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(paux) && !getBoard().thereIsAPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
            paux.setColumn(paux.getColumn() - 1);
        }

        if (getBoard().positionExists(paux) && isThereOpponentPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
        }

        // verify right
        paux.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(paux) && !getBoard().thereIsAPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
            paux.setColumn(paux.getColumn() + 1);
        }

        if (getBoard().positionExists(paux) && isThereOpponentPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
        }

        // verify below

        paux.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(paux) && !getBoard().thereIsAPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
            paux.setRow(paux.getRow() + 1);
        }

        if (getBoard().positionExists(paux) && isThereOpponentPiece(paux)) {
            mat[paux.getRow()][paux.getColumn()] = true;
        }


        return mat;

    }
}
